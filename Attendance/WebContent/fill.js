$('document').ready(function(){
	
	$.getJSON('FetchCountryJSON',{ajax:true},
			function(data){
		    $('#cnt').empty();
		    $('#cnt').append($('<option>').text('-Select-'));
		    $('#st').append($('<option>').text('-Select-'));
		    $('#ct').append($('<option>').text('-Select-'));
		    $.each(data,function(i,item){
		    
		  $('#cnt').append($('<option>').text(item.COUNTRYNAME).attr('value',item.COUNTRYID));	
		    	
		    	
		    });
		});
	
	
	
	$('#cnt').change(function(){
		
		
		$.getJSON('FetchStateJSON',{cntid:$('#cnt').val(),ajax:true},
				function(data){
			    $('#st').empty();
			    $('#st').append($('<option>').text('-Select-'));
			    $.each(data,function(i,item){
			    
			  $('#st').append($('<option>').text(item.STATENAME).attr('value',item.STATEID));	
			    	
			    	
			    });
			});
	}) ;
		
		$('#st').change(function(){
			
			
			$.getJSON('FetchCityJSON',{sttid:$('#st').val(),ajax:true},
					function(data){
				    $('#ct').empty();
				    $('#ct').append($('<option>').text('-Select-'));
				    $.each(data,function(i,item){
				    
				  $('#ct').append($('<option>').text(item.CITYNAME).attr('value',item.CITYID));	
				    	
				    	
				    });
			});
		
	});
	
});
	
	
	
	