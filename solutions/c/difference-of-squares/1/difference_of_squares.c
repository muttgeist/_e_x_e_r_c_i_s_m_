#include "difference_of_squares.h"
unsigned int sum_of_squares(unsigned int number){
    unsigned int sos = 0;
    for(unsigned int j = 1; j<=number; j++){
            sos += (j * j);
        }
    return sos;
}
unsigned int square_of_sum(unsigned int number){
    unsigned int tmp = 0;
    for (unsigned int i = 0; i<=number; i++){
        tmp += i;
    }
    unsigned int sos = 0;
    sos = tmp * tmp;
    return sos;
}
unsigned int difference_of_squares(unsigned int number){
    unsigned int dos = 0;
    dos = square_of_sum(number) - sum_of_squares(number);
    return dos;
}