// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.waf.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificatesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificatesPlainArgs Empty = new GetCertificatesPlainArgs();

    /**
     * The domain that you want to add to WAF.
     * 
     */
    @Import(name="domain")
    private @Nullable String domain;

    /**
     * @return The domain that you want to add to WAF.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * A list of Certificate IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Certificate IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * WAF instance ID.
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    /**
     * @return WAF instance ID.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * A regex string to filter results by Certificate name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Certificate name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetCertificatesPlainArgs() {}

    private GetCertificatesPlainArgs(GetCertificatesPlainArgs $) {
        this.domain = $.domain;
        this.ids = $.ids;
        this.instanceId = $.instanceId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificatesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificatesPlainArgs $;

        public Builder() {
            $ = new GetCertificatesPlainArgs();
        }

        public Builder(GetCertificatesPlainArgs defaults) {
            $ = new GetCertificatesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain that you want to add to WAF.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable String domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param ids A list of Certificate IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Certificate IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceId WAF instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Certificate name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetCertificatesPlainArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
