<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>信息录入</h3>
	<form action="${pageContext.request.contextPath}/product?cmd=saveOrUpdate&id=${p.id}" method="post">
		商品名：<input type="text" name="productName" value="${p.productName}"/><br/>
		商品类型：<select name="dir_id">
				<option value="1" ${p.dir_id == 1 ? 'selected="selected"': ''}>鼠标</option>
				<option value="2" ${p.dir_id == 2 ? 'selected="selected"': ''}>无线鼠标</option>
				<option value="3" ${p.dir_id == 3 ? 'selected="selected"': ''}>有线鼠标</option>
				<option value="4" ${p.dir_id == 4 ? 'selected="selected"': ''}>游戏鼠标</option>
		
		</select><br/>
		零售价：<input type="number" name="salePrice" value="${p.salePrice}" /><br/>
		供应商：<input type="text" name="supplier"/ value="${p.supplier}" /><br/>
		品牌：<input type="text" name="brand"/ value="${p.brand}" /><br/>
		折扣：<input type="number" name="cutoff" step="0.1" value="${p.cutoff}" /><br/>
		成本价：<input type="number" name="costPrice" value="${p.costPrice}" /><br/>
		<input type="submit" value="提交" />
	
	</form>
</body>
</html>