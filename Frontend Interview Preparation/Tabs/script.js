const html = document.getElementById('html-btn');
const css = document.getElementById('css-btn');
const js = document.getElementById('js-btn');
const htmltext = document.getElementById('html-text');
const csstext = document.getElementById('css-text');
const jstext =  document.getElementById('js-text');


html.addEventListener('click', () => {
    jstext.classList.remove('selected');
    htmltext.classList.add('selected');
})

css.addEventListener('click', () => {
    htmltext.classList.remove('selected');
    csstext.classList.add('selected');
})

js.addEventListener('click', () => {
    csstext.classList.remove('selected');
    jstext.classList.add('selected');
})