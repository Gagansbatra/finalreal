$(document).ready(
        function() {
        	$("#myform").validate({
        		 rules:{
        		   fn:{required:true,lettersonly:true },
        		   fc:{required:true,minlength:10,maxlength:12,digitonly:true}
        		 },
        		 messages:{
        		   fn:{required: "Please provide User Name"},
        		   fc:{
        		           required: "Please provide Mobile No",
        		           minlength: "Your mobile must be at least 10 Digit long"
        		                    }},submitHandler: function(form) {
        		                    form.submit();
        		                }

        		 });
        	
        	
        });