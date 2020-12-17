public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> helper= new Stack<>();
        while(q.size()>0){
            helper.push(q.remove());
            
        }
        while(helper.size()>0){
            q.add(helper.pop());
        }
        return q;
}
