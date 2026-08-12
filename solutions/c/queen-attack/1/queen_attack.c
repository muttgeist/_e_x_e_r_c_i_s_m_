#include "queen_attack.h"
#include <stdbool.h>
#include <stdlib.h>
attack_status_t can_attack(position_t queen_1, position_t queen_2){
    if(is_on_board(queen_1, queen_2)){
        if (is_same_spot(queen_1, queen_2)){
            return INVALID_POSITION;}
        else if (is_diagonal(queen_1, queen_2)){
            return CAN_ATTACK;}
        else if (is_lines(queen_1, queen_2)){
            return CAN_ATTACK;}
        else return CAN_NOT_ATTACK;
    }    
    else return INVALID_POSITION;
}
bool is_diagonal(position_t queen_1, position_t queen_2){
    /*char q1 [8] = {'0'};
    char q2 [8] = {'0'};
    char q3 [8] = {'0'};
    char q4 [8] = {'0'};
    for (int i = queen_1.row ; i>=0 ; i--){
        if (i == queen_1.row){q1 [i] = 'z';}
        else 
            q1 [i] = 'a';
    }
    for (int i = queen_1.row ; i<8 ; i++){
        if (i == queen_1.row){q2 [i] = 'z';}
        else
            q2 [i] = 'a';
    }
    for (int i = queen_1.column ; i>=0 ; i--){
        if (i == queen_1.column){q3 [i] = 'z';}
        else
            q3 [i] = 'a';
    }
    for (int i = queen_1.column ; i<8 ; i++){
        if (i == queen_1.column){q4 [i] = 'z';}
        else
            q4 [i] = 'a';
    }
    for (int i = queen_2.row ; i>=0 ; i--){
        if(q1 [i] == 'a') {
            for (int j = queen_2.column ; j>=0 ; j--){
                if(q3 [j] == 'a'){
                    for (int k = queen_2.row ; k<8 ; k++){
                        if(q2 [k] == 'a') {
                            for (int l = queen_2.column ; l<8 ; l++){
                                if (q4 [l] == 'a'){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return false;
*/
    return abs(queen_2.row - queen_1.row) == abs(queen_2.column - queen_1.column);
    
}
bool is_same_spot(position_t queen_1, position_t queen_2){
    if(queen_1.row == queen_2.row && queen_1.column == queen_2.column){
        return true;    }
    else return false;
}
bool is_lines(position_t queen_1, position_t queen_2){
    if (queen_1.row == queen_2.row || queen_1.column == queen_2.column){
        return true;}
    else return false;
}

bool is_on_board(position_t queen_1, position_t queen_2){
    bool is_on_board =             \
        queen_1.row <=7            \
        && queen_1.column <=7      \
        && queen_2.row <=7         \
        && queen_2.column <=7;
    if (is_on_board){ return true;}
    else return false;
}