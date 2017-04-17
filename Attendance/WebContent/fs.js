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
		 	$.getJSON('FetchSubjectByBranchAndSemJSON',{bid:$('#bid').val(),sm:$('#sm').val(),$ajax:true},
					function(data){
				    $('#sbid').empty();
				    $('#sbid').append($('<option>').text('-Select-'));
				    $.each(data,function(i,item){
				    
				  $('#sbid').append($('<option>').text(item.SUBJECTNAME).attr('value',item.SUBJECTID));	
				    	
				    	
				    });
				});
		}) ;
		
       
});