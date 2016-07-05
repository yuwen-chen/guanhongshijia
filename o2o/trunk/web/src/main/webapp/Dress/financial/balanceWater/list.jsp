<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/Dress/include/top.jsp" %>
<%--
  ~ Copyright (c) 2009-2016 SHENZHEN Eternal Dynasty Technology Co.,Ltd.
  ~ All rights reserved.
  ~
  ~ This file contains valuable properties of  SHENZHEN Eternal Dynasty
  ~ Technology Co.,Ltd.,  embodying  substantial  creative efforts  and
  ~ confidential information, ideas and expressions.    No part of this
  ~ file may be reproduced or distributed in any form or by  any  means,
  ~ or stored in a data base or a retrieval system,  without  the prior
  ~ written permission  of  SHENZHEN Eternal Dynasty Technology Co.,Ltd.
  ~
  --%>

<script type="text/javascript">
	var i=1;

	function allChoose(){
		$("[name='list']").attr("checked",'true');
	}
	
	function allCancel(){
		$("[name='list']").removeAttr("checked");
	}
	function xz(){
		if(i==1){
			allChoose();
			i=0;
		}else{
			allCancel();
			i=1;
		}
	}
	function ok(url){
		if(confirm("请确认是否启用该方案?")){
			window.location=url;
		}
	}
	function delall(){
		if(confirm("请确认是否执行删除操作!"))
			document.getElementById("del").submit();
	}
	function delUrl(url){
		if(confirm("请确认是否执行删除操作!")){
			window.location=url;
		}
	}
	function cz(){
		document.getElementById("czlist").submit();
	}
</script>




<table cellspacing="2" cellpadding="0" class="tab2">
	<tr>
		<td class="tab2_top">
			
		</td>
	</tr>
	<tr>
		<td>
			<form method="post" id="czlist" name="form1" action="<%=request.getContextPath()%>/html/manage/withdrawalAuditaudit/list">
				<input type="hidden" name="pageNo" id="pageNo" value=${PAGE_INFO.pageNo } />
				<table cellspacing="0" cellpadding="0">
					<tr>
						<td class="tab2_tou">
							<a href="<%=request.getContextPath()%>/html/manage/balanceWater/list">
								<img src="<%=request.getContextPath()%>/Dress/img/biao_03.gif" border="0" />
							</a>
						</td>
					</tr>
				</table>
			</form>
		</td>
	</tr>
	<tr><td colspan=10>
		<table cellspacing="0" cellpadding="0">
					<tr>
						<td style="font-size:30px;">
							账户余额:<span style="color:#ff0000">${m.money }</span>(元)
						</td>
					</tr>
				</table>
	</td></tr>
	<tr>
		<td>
			<form method="post" id="del" action="<%=request.getContextPath()%>/html/manage/withdrawalAuditaudit/delall">
				<input type="hidden" name="_method" value="delete" />
				<table cellspacing="0" cellpadding="0" class="table4_da">
					<thead>
					<tr>
							<td>
								店铺名称
							</td>
					       <td>
                                 时间
                            </td>
							<td>
							     交易类型
							</td>
							<td>
								交易金额
							</td>
							
							<td>
								备注
							</td>
					</tr>
					</thead>
					<c:forEach var='info' items='${DATA}' varStatus='index'>
						 <tr>
						 	   <td class="td_a">
                                    ${info.merchant.name}
                                </td>
						      <td class="td_a">
                                    ${info.time}
                                </td>
							   <td class="td_a">
							   	<c:if test="${info.flag==0}">支出</c:if>
							   	<c:if test="${info.flag==1}">收入</c:if>
								</td>
								<td class="td_a">
									${info.money}(元)
								</td>
								<td class="td_a">
									${info.ps}
								</td>
						</tr>
					</c:forEach>
					<jsp:include page="/Dress/include/nofenye.jsp">
						<jsp:param name="url" value="/html/manage/withdrawal/list" />
					</jsp:include>
				</table>
			</form>
		</td>
	</tr>
</table>
</html>