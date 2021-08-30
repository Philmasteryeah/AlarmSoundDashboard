package org.philmaster.alarmsounddashboard.component;

import org.springframework.stereotype.Component;

@Component
public class ReactiveHandler {

//	public Mono<ServerResponse> hello(ServerRequest request) {
//		return ServerResponse.ok()
//				.contentType(MediaType.TEXT_PLAIN)
//				.body(BodyInserters.fromValue("Hello world!"));
//	}
//
//	private WebClient client = WebClient.create("http://localhost:8080");
//
//	public String greet(String name) {
//		Mono<ClientResponse> result = client.get()
//				.uri(uriBuilder -> uriBuilder.path("/api/{name}")
//						.build(name))
//				.accept(MediaType.TEXT_PLAIN)
//				.retrieve()
//				.bodyToMono(ClientResponse.class);
//		return result.flatMap(res -> res.bodyToMono(String.class))
//				.block();
//	}
}
