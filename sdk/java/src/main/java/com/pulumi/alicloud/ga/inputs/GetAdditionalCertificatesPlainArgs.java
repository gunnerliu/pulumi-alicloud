// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAdditionalCertificatesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAdditionalCertificatesPlainArgs Empty = new GetAdditionalCertificatesPlainArgs();

    /**
     * The ID of the GA instance.
     * 
     */
    @Import(name="acceleratorId", required=true)
    private String acceleratorId;

    /**
     * @return The ID of the GA instance.
     * 
     */
    public String acceleratorId() {
        return this.acceleratorId;
    }

    /**
     * A list of Additional Certificate IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Additional Certificate IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The ID of the listener. Only HTTPS listeners support this parameter.
     * 
     */
    @Import(name="listenerId", required=true)
    private String listenerId;

    /**
     * @return The ID of the listener. Only HTTPS listeners support this parameter.
     * 
     */
    public String listenerId() {
        return this.listenerId;
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetAdditionalCertificatesPlainArgs() {}

    private GetAdditionalCertificatesPlainArgs(GetAdditionalCertificatesPlainArgs $) {
        this.acceleratorId = $.acceleratorId;
        this.ids = $.ids;
        this.listenerId = $.listenerId;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAdditionalCertificatesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAdditionalCertificatesPlainArgs $;

        public Builder() {
            $ = new GetAdditionalCertificatesPlainArgs();
        }

        public Builder(GetAdditionalCertificatesPlainArgs defaults) {
            $ = new GetAdditionalCertificatesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param ids A list of Additional Certificate IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Additional Certificate IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param listenerId The ID of the listener. Only HTTPS listeners support this parameter.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(String listenerId) {
            $.listenerId = listenerId;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetAdditionalCertificatesPlainArgs build() {
            $.acceleratorId = Objects.requireNonNull($.acceleratorId, "expected parameter 'acceleratorId' to be non-null");
            $.listenerId = Objects.requireNonNull($.listenerId, "expected parameter 'listenerId' to be non-null");
            return $;
        }
    }

}
