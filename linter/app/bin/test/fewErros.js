function not(a) {
  if (a === 0)
    return 1
  else
    return 0
}

function nand(a,b) {
  return not(and(a, b))
}

function nor(a,b) {
  return not(or(a,b))
}

function add1(a,b) {
  overflow = and(a,b)
  sum = xor(a,b)
  return {sum, overflow}
}