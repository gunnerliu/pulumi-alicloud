// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerCertificateArgs Empty = new ServerCertificateArgs();

    /**
     * @deprecated
     * Field &#39;alicloud_certifacte_id&#39; has been deprecated from provider version 1.68.0. Use &#39;alicloud_certificate_id&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'alicloud_certifacte_id' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_id' replaces it. */
    @Import(name="alicloudCertifacteId")
    private @Nullable Output<String> alicloudCertifacteId;

    /**
     * @deprecated
     * Field &#39;alicloud_certifacte_id&#39; has been deprecated from provider version 1.68.0. Use &#39;alicloud_certificate_id&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'alicloud_certifacte_id' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_id' replaces it. */
    public Optional<Output<String>> alicloudCertifacteId() {
        return Optional.ofNullable(this.alicloudCertifacteId);
    }

    /**
     * @deprecated
     * Field &#39;alicloud_certifacte_name&#39; has been deprecated from provider version 1.68.0. Use &#39;alicloud_certificate_name&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'alicloud_certifacte_name' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_name' replaces it. */
    @Import(name="alicloudCertifacteName")
    private @Nullable Output<String> alicloudCertifacteName;

    /**
     * @deprecated
     * Field &#39;alicloud_certifacte_name&#39; has been deprecated from provider version 1.68.0. Use &#39;alicloud_certificate_name&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'alicloud_certifacte_name' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_name' replaces it. */
    public Optional<Output<String>> alicloudCertifacteName() {
        return Optional.ofNullable(this.alicloudCertifacteName);
    }

    /**
     * an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
     * 
     */
    @Import(name="alicloudCertificateId")
    private @Nullable Output<String> alicloudCertificateId;

    /**
     * @return an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
     * 
     */
    public Optional<Output<String>> alicloudCertificateId() {
        return Optional.ofNullable(this.alicloudCertificateId);
    }

    /**
     * the name of the certificate specified by `alicloud_certificate_id`.but it is not supported on the international site of alibaba cloud now.
     * 
     */
    @Import(name="alicloudCertificateName")
    private @Nullable Output<String> alicloudCertificateName;

    /**
     * @return the name of the certificate specified by `alicloud_certificate_id`.but it is not supported on the international site of alibaba cloud now.
     * 
     */
    public Optional<Output<String>> alicloudCertificateName() {
        return Optional.ofNullable(this.alicloudCertificateName);
    }

    /**
     * the region of the certificate specified by `alicloud_certificate_id`. but it is not supported on the international site of alibaba cloud now.
     * 
     */
    @Import(name="alicloudCertificateRegionId")
    private @Nullable Output<String> alicloudCertificateRegionId;

    /**
     * @return the region of the certificate specified by `alicloud_certificate_id`. but it is not supported on the international site of alibaba cloud now.
     * 
     */
    public Optional<Output<String>> alicloudCertificateRegionId() {
        return Optional.ofNullable(this.alicloudCertificateRegionId);
    }

    /**
     * Name of the Server Certificate.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Server Certificate.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * the content of privat key of the ssl certificate specified by `server_certificate`. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return the content of privat key of the ssl certificate specified by `server_certificate`. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * The Id of resource group which the slb server certificate belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The Id of resource group which the slb server certificate belongs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * the content of the ssl certificate. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
     * 
     */
    @Import(name="serverCertificate")
    private @Nullable Output<String> serverCertificate;

    /**
     * @return the content of the ssl certificate. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
     * 
     */
    public Optional<Output<String>> serverCertificate() {
        return Optional.ofNullable(this.serverCertificate);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ServerCertificateArgs() {}

    private ServerCertificateArgs(ServerCertificateArgs $) {
        this.alicloudCertifacteId = $.alicloudCertifacteId;
        this.alicloudCertifacteName = $.alicloudCertifacteName;
        this.alicloudCertificateId = $.alicloudCertificateId;
        this.alicloudCertificateName = $.alicloudCertificateName;
        this.alicloudCertificateRegionId = $.alicloudCertificateRegionId;
        this.name = $.name;
        this.privateKey = $.privateKey;
        this.resourceGroupId = $.resourceGroupId;
        this.serverCertificate = $.serverCertificate;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerCertificateArgs $;

        public Builder() {
            $ = new ServerCertificateArgs();
        }

        public Builder(ServerCertificateArgs defaults) {
            $ = new ServerCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;alicloud_certifacte_id&#39; has been deprecated from provider version 1.68.0. Use &#39;alicloud_certificate_id&#39; replaces it.
         * 
         */
        @Deprecated /* Field 'alicloud_certifacte_id' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_id' replaces it. */
        public Builder alicloudCertifacteId(@Nullable Output<String> alicloudCertifacteId) {
            $.alicloudCertifacteId = alicloudCertifacteId;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;alicloud_certifacte_id&#39; has been deprecated from provider version 1.68.0. Use &#39;alicloud_certificate_id&#39; replaces it.
         * 
         */
        @Deprecated /* Field 'alicloud_certifacte_id' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_id' replaces it. */
        public Builder alicloudCertifacteId(String alicloudCertifacteId) {
            return alicloudCertifacteId(Output.of(alicloudCertifacteId));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;alicloud_certifacte_name&#39; has been deprecated from provider version 1.68.0. Use &#39;alicloud_certificate_name&#39; replaces it.
         * 
         */
        @Deprecated /* Field 'alicloud_certifacte_name' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_name' replaces it. */
        public Builder alicloudCertifacteName(@Nullable Output<String> alicloudCertifacteName) {
            $.alicloudCertifacteName = alicloudCertifacteName;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;alicloud_certifacte_name&#39; has been deprecated from provider version 1.68.0. Use &#39;alicloud_certificate_name&#39; replaces it.
         * 
         */
        @Deprecated /* Field 'alicloud_certifacte_name' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_name' replaces it. */
        public Builder alicloudCertifacteName(String alicloudCertifacteName) {
            return alicloudCertifacteName(Output.of(alicloudCertifacteName));
        }

        /**
         * @param alicloudCertificateId an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
         * 
         * @return builder
         * 
         */
        public Builder alicloudCertificateId(@Nullable Output<String> alicloudCertificateId) {
            $.alicloudCertificateId = alicloudCertificateId;
            return this;
        }

        /**
         * @param alicloudCertificateId an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
         * 
         * @return builder
         * 
         */
        public Builder alicloudCertificateId(String alicloudCertificateId) {
            return alicloudCertificateId(Output.of(alicloudCertificateId));
        }

        /**
         * @param alicloudCertificateName the name of the certificate specified by `alicloud_certificate_id`.but it is not supported on the international site of alibaba cloud now.
         * 
         * @return builder
         * 
         */
        public Builder alicloudCertificateName(@Nullable Output<String> alicloudCertificateName) {
            $.alicloudCertificateName = alicloudCertificateName;
            return this;
        }

        /**
         * @param alicloudCertificateName the name of the certificate specified by `alicloud_certificate_id`.but it is not supported on the international site of alibaba cloud now.
         * 
         * @return builder
         * 
         */
        public Builder alicloudCertificateName(String alicloudCertificateName) {
            return alicloudCertificateName(Output.of(alicloudCertificateName));
        }

        /**
         * @param alicloudCertificateRegionId the region of the certificate specified by `alicloud_certificate_id`. but it is not supported on the international site of alibaba cloud now.
         * 
         * @return builder
         * 
         */
        public Builder alicloudCertificateRegionId(@Nullable Output<String> alicloudCertificateRegionId) {
            $.alicloudCertificateRegionId = alicloudCertificateRegionId;
            return this;
        }

        /**
         * @param alicloudCertificateRegionId the region of the certificate specified by `alicloud_certificate_id`. but it is not supported on the international site of alibaba cloud now.
         * 
         * @return builder
         * 
         */
        public Builder alicloudCertificateRegionId(String alicloudCertificateRegionId) {
            return alicloudCertificateRegionId(Output.of(alicloudCertificateRegionId));
        }

        /**
         * @param name Name of the Server Certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Server Certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateKey the content of privat key of the ssl certificate specified by `server_certificate`. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey the content of privat key of the ssl certificate specified by `server_certificate`. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param resourceGroupId The Id of resource group which the slb server certificate belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The Id of resource group which the slb server certificate belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param serverCertificate the content of the ssl certificate. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
         * 
         * @return builder
         * 
         */
        public Builder serverCertificate(@Nullable Output<String> serverCertificate) {
            $.serverCertificate = serverCertificate;
            return this;
        }

        /**
         * @param serverCertificate the content of the ssl certificate. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
         * 
         * @return builder
         * 
         */
        public Builder serverCertificate(String serverCertificate) {
            return serverCertificate(Output.of(serverCertificate));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public ServerCertificateArgs build() {
            return $;
        }
    }

}
