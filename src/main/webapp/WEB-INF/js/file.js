function testUpload(){  
    var form = new FormData(document.getElementById("uploadImg"));  
      
    $.ajax({  
        url : url,  
        data : form,  
        type : 'post',  
        processData:false,  
        contentType:false,  
        success : function(data){  
            alert("成功")  
        },  
        error : function(data){  
            alert("有错误的地方")
        }  
    });  
}

//此处使用ajax技术来请求数据
function findAData (){
	$.ajax({
	       type:'post', 
	       url: 'findData',     //'http://localhost:8080/ssm_12_7/findData',
	       //dataType:'json',
	       success:function(data){
	    	   //alert(data);
	    	   $("#serach").html("");
	    	   $("#serach").append("当前用户姓名："+data.name+"</br>"+"当前用户所"+
	    	   		"做项目:"+data.context+"</br>"+"所拥有技能:"+data.skills);
	    	   
	       },
	       error:function(){
	    	   alert("错误信息");
	       }
	});
	
}
	
		