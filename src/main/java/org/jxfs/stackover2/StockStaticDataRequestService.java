package org.jxfs.stackover2;

import org.jxfs.grpc.stackover2.api.Security;
import org.jxfs.grpc.stackover2.api.StockStaticDataRequestServiceGrpc.StockStaticDataRequestServiceImplBase;
import org.jxfs.grpc.stackover2.api.StockStaticManyDataRequest;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class StockStaticDataRequestService  extends StockStaticDataRequestServiceImplBase {
	  @Override
	    public void getManyStockStatics(StockStaticManyDataRequest request, StreamObserver<Security> responseObserver) {
	        responseObserver.onNext(Security.newBuilder()
	            .setSecurity("TEST-MANY")
	            .build());
	        responseObserver.onNext(Security.newBuilder()
	            .setSecurity("TEST-MORE")
	            .build());
	        responseObserver.onCompleted();
	    }
}
