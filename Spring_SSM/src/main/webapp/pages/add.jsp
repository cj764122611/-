<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript" src="js/add.js"></script>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<div id="regLogin" class="wrap">
	<div class="dialog">
		<dl class="clearfix">
			<dt>新房屋信息发布</dt>
			<dd class="past">填写房屋信息</dd>
		</dl>
		<div class="box">
			<form id="House_add" name="House_add" enctype="multipart/form-data">
				<div class="infos">
					<table class="field">
						<tr>
							<td class="field">标 题：</td>
							<td><input type="text" name="title" value="" id="House_add_title" class="text" /></td>
						</tr>
						<tr>
							<td class="field">户 型：</td>
							<td><select class="text" name="houseType.id" id="houseType_id"></select></td>
						</tr>
						<tr>
							<td class="field">面 积：</td>
							<td><input type="text" name="floorage" value="" id="House_add_floorage" class="text" /></td>
						</tr>
						<tr>
							<td class="field">价 格：</td>
							<td><input type="text" name="price" value="" id="House_add_price" class="text" /></td>
						</tr>

						<tr>
							<td class="field">房产证日期：</td>
							<td><input type="text" class="text" name="pubdate" id="House_add_pubdate"/></td>
						</tr>

						<tr>
							<td class="field">位 置：</td>
							<td>区：<select class="text" name="district.id" id="district_id" onchange="onchangeDistrict(this)"></select>
								街：<select class="text" name="street.id" id="street_id"></select>
							</td>
						</tr>
						<tr>
							<td class="field">联系方式：</td>
							<td><input type="text" name="contact" value="" id="House_add_contact" class="text" /></td>
						</tr>
						<tr>
							<td class="field">详细信息：</td>
							<td><textarea name="description" class="ckeditor"></textarea></td>
						</tr>
					</table>
					<div class="buttons">
						<input type="button" onclick="addHouse()" value="立即发布" />
					</div>
				</div>
			</form>
		</div>
	</div>
</div>