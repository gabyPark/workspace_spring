<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">REGISTER BOARD</h3>
				</div>
				<!-- /.box-header -->
	
	      <form action="" method="post" role="form">
	         <div class="box-body">
	            <div class="form-group">
	              <label for="exampleInputEmail1">제목</label>
	              <input type="text" name="title" 
	                class="form-control" placeholder="제목을 입력하세요">
	            </div>
	            <div class="form-group">
	              <label for="exampleInputEmail1">내용</label>
	              <textarea rows="3" class="form-control"
	                 name="content" placeholder="내용을 입력하시오"
	               ></textarea>
	            </div>
	            <div class="form-group">
	              <label for="exampleInputEmail1">글쓴이</label>
	              <input type="text" name="writer" 
	                class="form-control" placeholder="글쓴이를 입력하세요">
	            </div>	         
	         </div>
	         
	         <!-- /. box-body 끝 -->
	      
	      <div class="box-footer" >
	        <button type="submit" class="btn btn-primary">Submit</button>	      
	      </div>
	      
	      
	      
	      </form>

			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@ include file="../include/footer.jsp" %>

