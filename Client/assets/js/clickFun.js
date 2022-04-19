import $ from 'jquery-1.11.1.min'
$(".xe-widget").click(function(){
    console.log(11111);
    alert(123);
    $.ajax({url:"demo_test.txt",success:function(result){
            $("#div1").html(result);
        }});
});