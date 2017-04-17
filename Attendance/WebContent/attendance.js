$('document').ready(function(){
	
	$.getJSON('FetchAllBranchJSON',{ajax:true},
			function(data){
		    $('#bid').empty();
		    $('#bid').append($('<option>').text('-Select-'));
		    $('#sub').append($('<option>').text('-Select-'));
		    $('#sm').append($('<option>').text('-Select-'));
		    $.each(data,function(i,item){
		    
		  $('#bid').append($('<option>').text(item.BRANCHNAME).attr('value',item.BRANCHID));	
		    	
		    	
		    });
		});
	
	
	
	$('#bid').change(function(){
		
		
		$.getJSON('FetchSemBySubjectJSON',{bid:$('#bid').val(),ajax:true},
				function(data){
			
			 $('#sm').empty();
			  $('#sm').append($('<option>').text('-Select-'));
			  $.each(data,function(i,item){
				  $('#sm').append($('<option>').text(item.SEMESTER).attr('value',item.SEMESTER));
				 
			    	
			    	
			    });
			});
		
	$('#sm').change(function(){
		 //alert('1');
		$.getJSON('FetchAllSubjectJSON',{sm:$('#sm').val(),ajax:true},
		function(data){
			 $('#sub').empty();
		    $('#sub').append($('<option>').text('-Select-'));
		    $.each(data,function(i,item){
		    
		  $('#sub').append($('<option>').text(item.SUBJECTNAME).attr('value',item.SUBJECTCODE));	
		
		   });
			
		});
		
		
	$('#result').on("click",".std",function(){
		/*$.get('FinalAttendance',{enrl:$(this).attr('enrl'),bid:$(this).attr('bid'),sm:$(this).attr('sm'),sub:$(this).attr('sub'),cd:$(this).attr('cd'),ajax:true},function(data){
		 	
		
		});*/
		$(this).parent().parent().remove();   
		
		
	});	
		
		$('#sub').change(function(){
			 //alert('1');
			//$.getJSON('FetchStdByBrnAndSmJSON',{sm:$('#sm').val(),bid:$('#bid').val(),ajax:true},
			$.getJSON('FetchStudents',{sm:$('#sm').val(),bid:$('#bid').val(),ajax:true},
			function(data){
				 
	                    
	                	
	                    var html = '<table border=1>';
	                   // var len = data.length;
	                    html+="<tr><th>Student ID</th><th>Student Name</th><th>Student Photograph</th></tr>";
                        var cd=new Date();
                        var d=cd.getFullYear()+"/"+(cd.getMonth()+1)+"/"+cd.getDate();
	                    $.each(data, function(i, item) {
	                    	html += '<tr><td>' + item.STUDENTID + '</TD><TD>' + item.STUDENTNAME  +'</TD><TD><a href="javascript;" class=std enrl='+item.STUDENTID+' bid='+$('#bid').val()+' sm='+$('#sm').val()+' sub='+$('#sub').val()+' cd='+d+'><img src=pic/' +item.PHOTOGRAPH +' width=60 height=60></a></TD></TR>'; 
	                      });
	                    
	                    html += '</TABLE>';
	   
	                    $('#result').html(html);
	                });
	            });
	});
	});
});
	            
	            
	        
	       
				
	
	
	
	
