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
            alert("失败")
        }  
    });  
}


/*准备的页面数据,采用ajax发送请求*/
$(function(){
	$.ajax({
	       type:'post', 
	       url: 'findData',     //'http://localhost:8080/ssm_12_7/findData',
	       //dataType:'json',      ProjectController来处理请求
	       success:function(data){    	   	    	   
	    	   $("#serach").append("当前用户："+data.name+"</br>"+"内容"+
	    	   		"有:"+data.context+"</br>"+"技能:"+data.skills);
	    	   $('#context').append(data.name);
	    	   $('#context1').append(data.context);
	    	   $('#prointro1').append(data.skills);
	    	   $('#prointro2').append(data.skills);
	    	   $('#prointro3').append(data.skills);    	   
	       },
	       error:function(){
	    	   alert("没有相应的数据哦");
	       }
	});
})
	
/*点击保存时候，不满足条件时候，阻止表单提交*/
$(function(){
 $('#edit_deal').click(function(){
 /*id不能为空*/
  var value=$('#edit_id').val();
  if(value==null||value==''){ 	
  	$('#edit_id')
  	.attr('value','我不能为空')
  	.focus(function(){
  	  $('#edit_id').attr('value','');
  	})
  	return false;
  }
  /*用户名不能为空*/
  var value=$('#edit_name').val();
  if(value==null||value==''){ 	
  	$('#edit_name')
  	.attr('value','我不能为空')
  	.focus(function(){
  	  $('#edit_name').attr('value','');
  	})
  	return false;
  }  
 })	
 
})


