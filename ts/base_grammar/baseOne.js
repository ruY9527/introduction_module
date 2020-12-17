var hello = "Hello World!";
console.log(hello);
var Site = /** @class */ (function () {
    function Site() {
    }
    Site.prototype.name = function () {
        console.log("My name is GavinYang");
    };
    return Site;
}());
var obj = new Site();
obj.name();
