//定义api的域名与端口
var baseUrl = "http://localhost:8888";

//数组传值时，不添加[]
$.ajaxSettings.traditional = true;


//为所有的ajax请求设置默认的属性
$.ajaxSetup({
    crossDomain: true,//允许跨域
    xhrFields: {withCredentials: true} //允许携带跨域的cookie
});


//获取url上的请求参数
function getParams() {
    //获取问号及问号后面的内容
    var url = window.location.search;
    var params = {};
    if (url.indexOf("?") != -1) {
        //截取问号后面的内容,再使用&分割多个属性
        var arr = url.substr(1).split("&");
        for (var i = 0; i < arr.length; i++) {
            //使用=分割为keyvalue
            var keyValue = arr[i].split("=");
            params[keyValue[0]] = keyValue[1];
        }
    }
    return params;
}


function getHrefFun(item,value) { //item代表当前的标签,value代表需要使用的值(render-key获取的值)
    var url = $(item).data('href');
    $(item).attr('href',url+value)
}