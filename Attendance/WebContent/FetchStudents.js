$(document).ready(function(){
	
	$('#result').on("click",".std",function(){
		$.get('FinalAttendance',{fid:$('#fid').val(),cd:$(this).attr('cd'),sid:$(this).attr('sid'),bid:$(this).attr('bid'),sm:$(this).attr('sm'),sbid:$(this).attr('sbid'),cd:$(this).attr('cd'),ajax:true},function(data){
		    	
		});
		$(this).parent().parent().remove();   
		
		
		
	});	
   	
	$('#sbid').change(function(){
	$.getJSON("FetchStudents",{bid:$('#bid').val(),sm:$('#sm').val(),sbid:$('#sbid').val(),$ajax:true},
	function(data){
		
	var htm='';	
	

	htm+='<table border=1><caption>Student Register</caption>';
	htm+='<tr><td><i><b>Student ID:</b></i></td><td><i><b>Student Name</b></i></td><td><i><b>Student Photograph:</b></i></td></tr>';
	$.each(data,function(i,item){
		var cd=new Date();
		var d=cd.getFullYear()+"/"+(cd.getMonth()+1)+"/"+cd.getDate();
	htm+='<tr><td>'+item.ENROLLMENTNO+'</td><td>'+item.NAME+'</td><td><a href="javascript:;" class=std  cd='+d+' sid='+item.ENROLLMENTNO+' bid='+$('#bid').val()+' sm='+$('#sm').val()+' sbid='+$('#sbid').val()+' cd='+$('#cd').val()+'><img src=pic/'+item.PHOTOGRAPH+' width=60 height=60></td><br></tr>';
		
	});	
	
	//$('#result').html(htm);
	htm+="</table>";
	$('#result').html(htm);
	}); });
 });


		
		