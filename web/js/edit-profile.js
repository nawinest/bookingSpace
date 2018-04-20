function filePreview(input){
    if (input.files && input.files[0]){
        var reader = new FileReader();
        reader.onload = function(e){
            $('#uploadForm + .avatar-preview').remove();
            // $('#uploadForm').after('<img src = "'+ e.target.result+'" width="100%" class="avatar-preview"/> ');
            
            $('.avatar-preview').attr("src", e.target.result);
        }
        reader.readAsDataURL(input.files[0]);
    }
}

$('#file').change(function(){
    filePreview(this);
});

$( "#btn-update" ).click(function() {
  alert( "updated !" );
});