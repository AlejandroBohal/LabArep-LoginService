let app = function (){
    const login = (username,password) =>{
        console.log(username,password);
        const user={username:username,password:password}
        axios.post('/login',user).then(res=>{
            if(res.data !== ''){
                window.location.href = 'secure/index.html';
            }else{
                alert(res.data);
            }
        })
    };
    const connectionExample = () =>{
        axios.get('/hello').then(res=>{
            $("#exampleConnection").empty();
            $("#exampleConnection").append(res.data);
        })
    };
    return {
        login: login,
        connectionExample
    };
}();
