/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 *
 * @author aluno
 */
public class HeuristicaNula implements Heuristic {
//    TileNode n, n1, start, target;
//    
//    public Heuristica(TileNode n, TileNode n1){
//        this.n = n;
//        this.n1 = n1;
//    //    this.start = startNode;
//    //    this.target = targetNode;
//    }
//    
//    public float nula(){
//        return 0;
//    }
//    
//    public float euclidian(){
//        float x, y, d;
//        x = Math.abs(n.getPosition().x - n1.getPosition().x);
//        y = Math.abs(n.getPosition().y - n1.getPosition().y);
//     //   d = this.start.getPosition().dst(this.target.getPosition());
//        
//        return ((x*x)+(y*y));
//    }

    @Override
    public float estimate(Object n, Object n1) {
        return 0;
    }
    
    
}
