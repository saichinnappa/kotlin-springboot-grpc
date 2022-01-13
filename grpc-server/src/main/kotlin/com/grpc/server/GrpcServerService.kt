package com.grpc.server

import io.grpc.examples.helloworld.GreeterGrpc
import io.grpc.examples.helloworld.HelloReply
import io.grpc.examples.helloworld.HelloRequest
import io.grpc.stub.StreamObserver

@GrpcService(GreeterGrpc::class)
class GrpcServerService : GreeterGrpc.GreeterImplBase() {

    fun sayHello(req: HelloRequest, responseObserver: StreamObserver<HelloReply>) {
        val reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build()
        responseObserver.onNext(reply)
        responseObserver.onCompleted()
    }
}
