// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeKubernetesConnectionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeKubernetesConnectionsArgs Empty = new EdgeKubernetesConnectionsArgs();

    @Import(name="apiServerInternet")
    private @Nullable Output<String> apiServerInternet;

    public Optional<Output<String>> apiServerInternet() {
        return Optional.ofNullable(this.apiServerInternet);
    }

    @Import(name="apiServerIntranet")
    private @Nullable Output<String> apiServerIntranet;

    public Optional<Output<String>> apiServerIntranet() {
        return Optional.ofNullable(this.apiServerIntranet);
    }

    @Import(name="masterPublicIp")
    private @Nullable Output<String> masterPublicIp;

    public Optional<Output<String>> masterPublicIp() {
        return Optional.ofNullable(this.masterPublicIp);
    }

    @Import(name="serviceDomain")
    private @Nullable Output<String> serviceDomain;

    public Optional<Output<String>> serviceDomain() {
        return Optional.ofNullable(this.serviceDomain);
    }

    private EdgeKubernetesConnectionsArgs() {}

    private EdgeKubernetesConnectionsArgs(EdgeKubernetesConnectionsArgs $) {
        this.apiServerInternet = $.apiServerInternet;
        this.apiServerIntranet = $.apiServerIntranet;
        this.masterPublicIp = $.masterPublicIp;
        this.serviceDomain = $.serviceDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeKubernetesConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeKubernetesConnectionsArgs $;

        public Builder() {
            $ = new EdgeKubernetesConnectionsArgs();
        }

        public Builder(EdgeKubernetesConnectionsArgs defaults) {
            $ = new EdgeKubernetesConnectionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiServerInternet(@Nullable Output<String> apiServerInternet) {
            $.apiServerInternet = apiServerInternet;
            return this;
        }

        public Builder apiServerInternet(String apiServerInternet) {
            return apiServerInternet(Output.of(apiServerInternet));
        }

        public Builder apiServerIntranet(@Nullable Output<String> apiServerIntranet) {
            $.apiServerIntranet = apiServerIntranet;
            return this;
        }

        public Builder apiServerIntranet(String apiServerIntranet) {
            return apiServerIntranet(Output.of(apiServerIntranet));
        }

        public Builder masterPublicIp(@Nullable Output<String> masterPublicIp) {
            $.masterPublicIp = masterPublicIp;
            return this;
        }

        public Builder masterPublicIp(String masterPublicIp) {
            return masterPublicIp(Output.of(masterPublicIp));
        }

        public Builder serviceDomain(@Nullable Output<String> serviceDomain) {
            $.serviceDomain = serviceDomain;
            return this;
        }

        public Builder serviceDomain(String serviceDomain) {
            return serviceDomain(Output.of(serviceDomain));
        }

        public EdgeKubernetesConnectionsArgs build() {
            return $;
        }
    }

}
