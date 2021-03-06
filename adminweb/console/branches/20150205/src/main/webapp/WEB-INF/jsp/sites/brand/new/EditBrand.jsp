<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib  uri="/WEB-INF/func.tld"  prefix="func"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>团车网专题管理</title>
<script type="text/javascript" src="/js/common/jquery.js"></script>
<script type="text/javascript" src="/js/common/jquery-ui.js"></script>
<script type="text/javascript" src="/js/common/jquery.blockUI.js"></script>
<script type="text/javascript" src="/js/common/jquery.tipsy.js"></script>
<script type="text/javascript" src="/js/common/validation.js"></script>
<script type="text/javascript" src="/js/common/common.js"></script>

 <!-- ztree ue-->
<script type="text/javascript" charset="utf-8" src="/ue/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/ue/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/js/ztree/ztree.3.5.js"> </script>
<script type="text/javascript" charset="utf-8" src="/js/ztree/jquery.ztree.exhide-3.5.min.js"> </script>
<!-- <script type="text/javascript" charset="utf-8" src="/js/ajaxfileupload.js"> </script> -->
<script type="text/javascript" src="/js/jquery.ajaxfileupload.js"></script>
<script type="text/javascript" src="/js/ajaxfileupload.js"></script>
<link rel="stylesheet" type="text/css" href="/css/demo.ztree.css" />
<link type="text/css" rel="stylesheet" href="/css/zTreeStyle.css"/>

<!-- <script type="text/javascript" src="/js/zixun/zixun.js"></script> -->
<script type="text/javascript" src="/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="/js/sites/sites.js"></script>
<link type="text/css" rel="stylesheet" href="/css/common/smoothness/jquery-ui-1.8.14.custom.css"/>
<link type="text/css" rel="stylesheet" href="/css/common/tipsy.css"/>
<link type="text/css" rel="stylesheet" href="/css/layout.css"/>
<script type="text/javascript" src="/js/common/jsdate.js"></script>
</head>
<body>
	<!-- <div id="tabs" class="tabs">  
	<ul>
		<li style="background:url(/images/ui-bg_glass_75_e6e6e6_1x400.png) #e6e6e6 repeat-x 50% 50%" ><a href="/specialSubject/home">专题列表</a></li>
		<li class="tabs_active" ><a href="/specialSubject/toAdd">添加品牌</a></li>
	</ul>
</div> -->
<c:if test="${brand.id!=null}">
<form action="/sites/brand/OneUpdate" method="post" style="padding:0 10px 0 10px; margin-top:0px" id="newZixunPropertiesForm">
	<input type="hidden" name="id" value="${brand.id }">
	<div class="borderDiv">
		<table>
            <tr>
            	<td style="vertical-align:top">品牌名称：</td>
                <td><input maxlength="50" type="text"  id="name" name="name" value="${brand.name }" style="width:130px;" />
                <span style="color:red;">* (请控制50字以内)</span>
                </td>
            </tr>
            <tr>
            				<td>
          	    	       	 品牌logo图：
          	                </td>
          	                <td>
          	                <c:choose>
          	                	<c:when test="${empty brand}">
          	                		  <img  id="oneImage" src='/images/upload.jpg' onclick="$('#listPicFile').trigger('click')"/><span class="font" style="color: red">*</span>
          	                	</c:when>
          	                	<c:otherwise>
          	                		  <img  id="oneImage" width="100px" height="100px" src='${brand.logo }' onclick="$('#listPicFile').trigger('click')"/>
          	                	</c:otherwise>
          	                </c:choose>
          	                    <input type="hidden" id="logo" name="logo"  value="${brand.logo }" />
          	                </td>
          	                <td>
                          	<span style="width:100px;padding-right:16px;padding-left:16px;vertical-align:top"></span>
					          <div style="display: none">
					           <input id="listPicFile" name="listPicFile" type="file"  onchange="sitesUpload()"/>
				             </div>
			               </td>
            </tr>
            	<tr>
            	<td style="vertical-align:top">系别：</td>
                <td>
                	<select name="newSeries">
                		<option selected="selected" value="">请选择标示系列</option>
                		<option value="1"  <c:if test="${brand.newSeries==1}">selected="selected"</c:if>>德系</option>
                		<option value="2" <c:if test="${brand.newSeries==2}">selected="selected"</c:if>>日系</option>
                		<option value="3" <c:if test="${brand.newSeries==3}">selected="selected"</c:if>>美系</option>
                		<option value="4" <c:if test="${brand.newSeries==4}">selected="selected"</c:if>>欧系</option>
                		<option value="5" <c:if test="${brand.newSeries==5}">selected="selected"</c:if>>韩系</option>
                		<option value="6" <c:if test="${brand.newSeries==6}">selected="selected"</c:if>>法系</option>
                		<option value="7" <c:if test="${brand.newSeries==7}">selected="selected"</c:if>>自主</option>
                	</select>
                 </td>
            </tr>
            <tr>
            </tr>
          </table>
            <table id="msg">
            <tr>
            	<td>&nbsp;</td>
            	<td>
            		<span id="errMsg" style="color:red;"></span>
            	</td>
            </tr>
        </table>
	</div>
	<div class="xtnext">
		<input type="submit"  value="保存"/>
	</div>
	</form>
	</c:if>
	<c:if test="${brand.id==null}">
	暂无数据
	</c:if>


</body>
</html>