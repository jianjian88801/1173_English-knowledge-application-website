
var projectName = '英语知识应用网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '考试记录',
	url: '../examrecord/list.html'
}, 
{
	name: '错题本',
	url: '../examrecord/wrong.html'
},
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '在线学习',
	url: './pages/zaixianxuexi/list.html'
}, 
{
	name: '学习技巧',
	url: './pages/xuexijiqiao/list.html'
}, 
{
	name: '培训信息',
	url: './pages/peixunxinxi/list.html'
}, 

{
	name: '英语角',
	url: './pages/forum/list.html'
}, 
{
	name: '试卷列表',
	url: './pages/exampaper/list.html'
}, 
]

var adminurl =  "http://localhost:8080/springbootk3yl6/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"在线学习","menuJump":"列表","tableName":"zaixianxuexi"}],"menu":"在线学习管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"学习技巧","menuJump":"列表","tableName":"xuexijiqiao"}],"menu":"学习技巧管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"培训信息","menuJump":"列表","tableName":"peixunxinxi"}],"menu":"培训信息管理"},{"child":[{"buttons":["查看","修改","审核"],"menu":"培训报名","menuJump":"列表","tableName":"peixunbaoming"}],"menu":"培训报名管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试卷管理","tableName":"exampaper"}],"menu":"试卷管理"},{"child":[{"buttons":["新增","查看","删除","修改"],"menu":"试题管理","tableName":"examquestion"}],"menu":"试题管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"英语角","tableName":"forum"}],"menu":"英语角"},{"child":[{"buttons":["删除","查看"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["查看"],"menu":"考试记录","tableName":"examrecord"},{"buttons":["查看"],"menu":"错题本","tableName":"examfailrecord"},{"buttons":["查看"],"menu":"试卷列表","tableName":"exampaperlist"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"在线学习列表","menuJump":"列表","tableName":"zaixianxuexi"}],"menu":"在线学习模块"},{"child":[{"buttons":["查看"],"menu":"学习技巧列表","menuJump":"列表","tableName":"xuexijiqiao"}],"menu":"学习技巧模块"},{"child":[{"buttons":["查看","报名"],"menu":"培训信息列表","menuJump":"列表","tableName":"peixunxinxi"}],"menu":"培训信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"在线学习","menuJump":"列表","tableName":"zaixianxuexi"}],"menu":"在线学习管理"},{"child":[{"buttons":["查看","查看评论"],"menu":"学习技巧","menuJump":"列表","tableName":"xuexijiqiao"}],"menu":"学习技巧管理"},{"child":[{"buttons":["查看","报名"],"menu":"培训信息","menuJump":"列表","tableName":"peixunxinxi"}],"menu":"培训信息管理"},{"child":[{"buttons":["查看","支付"],"menu":"培训报名","menuJump":"列表","tableName":"peixunbaoming"}],"menu":"培训报名管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["新增","查看","修改"],"menu":"英语角","tableName":"forum"}],"menu":"英语角"},{"child":[{"buttons":["查看"],"menu":"在线客服","tableName":"chat"}],"menu":"系统管理"},{"child":[{"buttons":["查看"],"menu":"错题本","tableName":"examfailrecord"},{"buttons":["查看"],"menu":"试卷列表","tableName":"exampaperlist"},{"buttons":["查看"],"menu":"考试记录","tableName":"examrecord"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"在线学习列表","menuJump":"列表","tableName":"zaixianxuexi"}],"menu":"在线学习模块"},{"child":[{"buttons":["查看"],"menu":"学习技巧列表","menuJump":"列表","tableName":"xuexijiqiao"}],"menu":"学习技巧模块"},{"child":[{"buttons":["查看","报名"],"menu":"培训信息列表","menuJump":"列表","tableName":"peixunxinxi"}],"menu":"培训信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
