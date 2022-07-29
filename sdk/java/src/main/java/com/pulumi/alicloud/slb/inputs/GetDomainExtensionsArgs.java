// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainExtensionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainExtensionsArgs Empty = new GetDomainExtensionsArgs();

    /**
     * The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
     * 
     */
    @Import(name="frontendPort", required=true)
    private Output<Integer> frontendPort;

    /**
     * @return The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
     * 
     */
    public Output<Integer> frontendPort() {
        return this.frontendPort;
    }

    /**
     * IDs of the SLB domain extensions.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return IDs of the SLB domain extensions.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The ID of the SLB instance.
     * 
     */
    @Import(name="loadBalancerId", required=true)
    private Output<String> loadBalancerId;

    /**
     * @return The ID of the SLB instance.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetDomainExtensionsArgs() {}

    private GetDomainExtensionsArgs(GetDomainExtensionsArgs $) {
        this.frontendPort = $.frontendPort;
        this.ids = $.ids;
        this.loadBalancerId = $.loadBalancerId;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainExtensionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainExtensionsArgs $;

        public Builder() {
            $ = new GetDomainExtensionsArgs();
        }

        public Builder(GetDomainExtensionsArgs defaults) {
            $ = new GetDomainExtensionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frontendPort The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(Output<Integer> frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        /**
         * @param frontendPort The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(Integer frontendPort) {
            return frontendPort(Output.of(frontendPort));
        }

        /**
         * @param ids IDs of the SLB domain extensions.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids IDs of the SLB domain extensions.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids IDs of the SLB domain extensions.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param loadBalancerId The ID of the SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId The ID of the SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetDomainExtensionsArgs build() {
            $.frontendPort = Objects.requireNonNull($.frontendPort, "expected parameter 'frontendPort' to be non-null");
            $.loadBalancerId = Objects.requireNonNull($.loadBalancerId, "expected parameter 'loadBalancerId' to be non-null");
            return $;
        }
    }

}
