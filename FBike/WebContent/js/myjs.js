function subNum() {
    if(parseInt(document.getElementById("num").value)>0)
    document.getElementById("num").value = document.getElementById("num").value - 1;
}
function addNum() {
    document.getElementById("num").value = (parseInt(document.getElementById("num").value) + 1).toString();
}
function subNum2() {
    if (parseInt(document.getElementById("num2").value) > 0)
    document.getElementById("num2").value = document.getElementById("num2").value - 1;
}
function addNum2() {
    document.getElementById("num2").value = (parseInt(document.getElementById("num2").value) + 1).toString();
}
function subNum3() {
    if (parseInt(document.getElementById("num3").value) > 0)
    document.getElementById("num3").value = document.getElementById("num3").value - 1;
}
function addNum3() {

    document.getElementById("num3").value = (parseInt(document.getElementById("num3").value) + 1).toString();
}
function subNum4() {
    if (parseInt(document.getElementById("num4").value) > 0)
    document.getElementById("num4").value = document.getElementById("num4").value - 1;
}
function addNum4() {
    document.getElementById("num4").value = (parseInt(document.getElementById("num4").value) + 1).toString();
}

  /*
   * 改变iframe连接
   */
function chaLiangtu(url) {
    document.getElementById("cheLiang1_tu").src = url;
}
function tiaozhuan(url) {
   window.parent.document.getElementById("iframe01").src = url
}

/*
 * 弹出层控制
 */
function show(tag) {
    var light = document.getElementById(tag);
    var fade = document.getElementById('fade');
    light.style.display = 'block';
    fade.style.display = 'block';
}
function hide(tag) {
    var light = document.getElementById(tag);
    var fade = document.getElementById('fade');
    light.style.display = 'none';
    fade.style.display = 'none';
}