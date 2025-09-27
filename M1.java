//longest substring without repeating character

import java.util.stream.Gatherers;

void main()
{
    "abcabcbb"
    .chars()
    .mapToObj(c->(c)char)
    .gather(Gatherers.scan()->"",(s,c) ->s.substring(s.indexOf(c)+1)+c)
    .mapToInt(String::length)
    .max()
    .orElse(0);

}
