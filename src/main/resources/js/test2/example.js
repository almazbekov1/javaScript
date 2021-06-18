function fetchData() {
    fetch("https://reqres.in/api/users")
        .then(response =>{
            if (!response.ok){
                throw Error("error");
            }
            return response.json();
        })
        .then(data => {
            console.log(data.data);
            const html = data.data
                .map(user => {
                    return `
                    <div class="user">
                         <p><img src="${user.avatar}" alt="${user.first_name}"></p>
                         <p>Name: ${user.first_name}</p>
                         <p>Email: ${user.email}</p>
                     </div>
                    `;
                })
                .join("");
            console.log(html);
            document.querySelector("#app").insertAdjacentHTML("afterbegin",html);
        })
        .catch(err => {
            console.log(err);
        })
}
fetchData();

// https://jsonplaceholder.typicode.com/users
// https://reqres.in/api/users