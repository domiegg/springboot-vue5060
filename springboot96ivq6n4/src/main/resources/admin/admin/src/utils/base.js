const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot96ivq6n4/",
            name: "springboot96ivq6n4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot96ivq6n4/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "后台管理"
        } 
    }
}
export default base
