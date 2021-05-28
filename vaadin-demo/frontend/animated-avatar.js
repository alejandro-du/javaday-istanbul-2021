class AnimatedAvatar extends HTMLElement {
	constructor() {
		super();

		this.attachShadow({ mode: "open" });
		this.shadowRoot.innerHTML = `
					<style>
						html {
							background-color: darkslategrey;
							color: white;
						}

						span {
							font-style: italic;
						}

						.container {
							border: 1px solid darkgray;
							margin: 1em;
							padding: 1em;
						}

						.container img {
							width: 100%;
						}

						.animated {
							transform: rotate(360deg);
							transition-duration: 1s;
						}
					</style>
					<div class="container">
						<span id="span"></span>
						<img id = "img" src="">
						<slot id="footer"></slot>
					</div>
				`;

	}

	connectedCallback() {
		let img = this.shadowRoot.getElementById("img");
		img.onclick = () => this.animateElement(img);
		img.setAttribute("src", this.getAttribute("image"));

		let span = this.shadowRoot.getElementById("span");
		span.innerText = this.getAttribute("title");
	}

	animateElement(element) {
		element.className = "animated";
		element.addEventListener("transitionend", () => element.className = "");
	}
}

customElements.define("animated-avatar", AnimatedAvatar);
