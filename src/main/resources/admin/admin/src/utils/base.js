const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootk3yl6/",
            name: "springbootk3yl6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootk3yl6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "英语知识应用网站"
        } 
    }
}
export default base
