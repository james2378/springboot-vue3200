const base = {
    get() {
        return {
            url : "http://localhost:8080/xinwenliumeitipingtai/",
            name: "xinwenliumeitipingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xinwenliumeitipingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "新闻流媒体平台"
        } 
    }
}
export default base
