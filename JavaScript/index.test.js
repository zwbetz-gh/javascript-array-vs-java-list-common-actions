test('forEach', () => {
  const arr = [1, 2, 3];
  arr.forEach((el) => console.log(el));
});

test('filter', () => {
  const arr = [1, 2, 3];
  const actual = arr.filter((el) => el === 3);
  const expected = [3];
  expect(actual).toEqual(expected);
});

test('map', () => {
  const arr = [1, 2, 3];
  const actual = arr.map((el) => el * 2);
  const expected = [2, 4, 6];
  expect(actual).toEqual(expected);
});

test('map', () => {
  const arr = [1, 2, 3];
  const actual = arr.reduce((subtotal, el) => subtotal + el);
  const expected = 6;
  expect(actual).toEqual(expected);
});

test('some', () => {
  const arr = [1, 2, 3];
  const actual = arr.some((el) => el === 3);
  const expected = true;
  expect(actual).toEqual(expected);
});

test('every', () => {
  const arr = [1, 2, 3];
  const actual = arr.every((el) => el === 3);
  const expected = false;
  expect(actual).toEqual(expected);
});
