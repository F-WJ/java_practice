function handResult(data) {
    if(data.success){
        $.messager.alert("温馨提示", "执行成功, 2秒之后自动刷新");
        setTimeout(function () {
            window.location.reload();
        }, 2000);
    }else{
        $.messager.alert("温馨提示", data.msg);
    }
}