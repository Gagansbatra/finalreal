$('document').ready(function(){
	
	$.getJSON('FetchAllFacultyJSON',{ajax:true},
			function(data){
		    $('#fid').empty();
		    $('#fid').append($('<option>').text('-Select-'));
		     $.each(data,function(i,item){
		    
		  $('#fid').append($('<option>').text(item.FACULTYNAME).attr('value',item.FACULTYID));	
		     });
		});	
		$.getJSON('FetchAllBranchJSON',{ajax:true},
				function(data){
			    $('#bid').empty();
			    $('#bid').append($('<option>').text('-Select-'));
			    $.each(data,function(i,item){
			    
			  $('#bid').append($('<option>').text(item.BRANCHNAME).attr('value',item.BRANCHID));	
			    	
			    	
			    });
			    
			});
		$('#sm').change(function(){
			$.getJSON("FetchStudents",{bid:$('#bid').val(),sm:$('#sm').val(),$ajax:true},
					function(data){
						
					var htm='';	
			
					htm+='<table border=1><caption>Student Register</caption>';
					htm+='<tr><td><i><b>Student ID:</b></i></td><td><i><b>Student Name</b></i></td><td><i><b>Student Photograph:</b></i></td><td>Enter/Update Marks</td><td>Display Marks</td></tr></tr>';
					$.each(data,function(i,item){
						htm+='<tr><td>'+item.ENROLLMENTNO+'</td><td>'+item.NAME+'</td><td>'+'<img src=pic/'+item.PHOTOGRAPH+' width=60 height=60></td><td><a href=EnterMarks?sid='+item.ENROLLMENTNO+'&bid='+item.BRANCH+'&sm='+item.SEM+' >Enter/Update Marks</a></td><td><a href=MarksDisplay?sid='+item.ENROLLMENTNO+'&bid='+item.BRANCH+'&sm='+item.SEM+' >MarksDisplay</a></td><br></tr>';
						
						
					});	
					
					//$('#result').html(htm);
					htm+="</table>";
					$('#result').html(htm);
					}); });
				 });
		
	