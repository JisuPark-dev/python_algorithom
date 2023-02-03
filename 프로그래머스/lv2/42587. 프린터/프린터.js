function solution(priorities, location) {
    var answer = [];
    
    //순서와 값이 있는 배열 생성
    var arr = [];
    for (var i =0; i<priorities.length; i++){
        arr.push({
            id:i,
            value:priorities[i]
        })
    }
    console.log(arr)
    console.log(arr[0].value)
    
    //그냥 정렬
    var new_priorities = priorities.sort().reverse();
    console.log(new_priorities)
    
    while(arr.length>0){
    //프린터 순서에 맞게 배열 정렬
    while(arr[0].value<new_priorities[0]){
        arr.push(arr[0]);
        arr.shift();
        
    }
    console.log(arr)
    
    if(arr[0].value == new_priorities[0]){
        answer.push(arr[0])
        new_priorities.shift();
        arr.shift()
    }
    // console.log(arr)
    // console.log(answer)
    }
    console.log(answer)
    console.log(answer.findIndex(i => i.id == location)+1)
    return answer.findIndex(i => i.id == location)+1

}