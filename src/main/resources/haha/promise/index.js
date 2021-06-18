console.log('request data...')


// setTimeout(()=>{
//     console.log('preparing data...')
//
//     const backenData = {
//         server:'awc',
//         port:2000
//     }
//
//     setTimeout(()=>{
//         backenData.modified = true
//         console.log('data received', backenData)
//     },2000)
// },2000)

const p = new Promise(function (resolve, reject) {
    setTimeout(()=>{
        console.log('preparing data...')
        const backenData = {
        server:'awc',
        port:2000
    }
    resolve(backenData)
    },2000)
})


p.then(data=>{
    const p2 = new Promise(((resolve, reject) => {
        setTimeout(()=>{
        data.modified = true
            resolve(data)
        // console.log('data received', backenData)
    },2000)
    }))
    p2.then(clientData =>{
        console.log(clientData)
    })
})