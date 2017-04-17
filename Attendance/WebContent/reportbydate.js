$('document').ready(function(){
	$.getJSON('FetchAllBranchJSON',{ajax:true},
			function(data){
		    $('#bid').empty();
		    $('#bid').append($('<option>').text('-Select-'));
		    $.each(data,function(i,item){
		    
		  $('#bid').append($('<option>').text(item.BRANCHNAME).attr('value',item.BRANCHID));	
		    	
		    	
		    });
		});
	$('#sm').change(function(){
		$.getJSON('FetchStudents',{sm:$('#sm').val(),bid:$('#bid').val(),ajax:true},
				function(data){
					 $('#sid').empty();
				    $('#sid').append($('<option>').text('-Select-'));
				    $.each(data,function(i,item){
				    
				  $('#sid').append($('<option>').text(item.ENROLLMENTNO).attr('value',item.ENROLLMENTNO));	
				
				   });
					
	}) ;
	
		$('#nd').change(function(){
			 //alert('1');
			$.getJSON('SummaryByDate',{sm:$('#sm').val(),bid:$('#bid').val(),sid:$('#sid').val(),pd:$('#pd').val(),nd:$('#nd').val(),ajax:true},
			function(data){
				var html="";
			    $.each(data,function(i,item){
			    
			  $('#sid').append($('<option>').text(item.ENROLLMENTNO).attr('value',item.ENROLLMENTNO));	
			  html = '<table border=1>';
               html+="<tr><th>Subject Code</th><th>Subject Name</th><th>Total Attendance</th></tr>";
               $.each(data, function(i, item) {
              	html += '<tr><td>' + item.SUBJECT + '</TD><TD>' + item.SUBJECTNAME+'</TD><TD>'+item.TOTAL+'</TD></TR>'; 
                });
              
              html += '</TABLE><br><br>';
                $('#result').html(html);
			   });
				
			});
			
			
	});
	});
});