$(document).ready(
        function() {
        	$("#myform").validate({
        		 rules:{
        		   sn:{required:true,lettersonly:true },
        		   sfn:{required:true,lettersonly:true },
        		   scno:{required:true,minlength:10,maxlength:12,digitonly:true},
        		   smob:{required:true,minlength:10,maxlength:12,digitonly:true}
        		 },
        		 messages:{
        		   sn:{required: "Please provide student Name"},
        		   sfn:{required: "Please provide Student's Father's Name"},
        		   scno:{
        		           required: "Please provide  Mobile No",
        		           minlength: "Your mobile must be at least 10 Digit long"
        		                    },
        		   smob:{
    		           required: "Please provide  Mobile No",
    		           minlength: "Your mobile must be at least 10 Digit long"
    		                    }},submitHandler: function(form) {
        		                    form.submit();
        		                }

        		 });
        	
        	
        });