// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerXForwardedForConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerXForwardedForConfigArgs Empty = new ListenerXForwardedForConfigArgs();

    /**
     * The Custom Header Field Names Only When `x_forwarded_for_client_cert_client_verify_enabled` Has a Value of True, this Value Will Not Take Effect until.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    @Import(name="xForwardedForClientCertClientVerifyAlias")
    private @Nullable Output<String> xForwardedForClientCertClientVerifyAlias;

    /**
     * @return The Custom Header Field Names Only When `x_forwarded_for_client_cert_client_verify_enabled` Has a Value of True, this Value Will Not Take Effect until.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    public Optional<Output<String>> xForwardedForClientCertClientVerifyAlias() {
        return Optional.ofNullable(this.xForwardedForClientCertClientVerifyAlias);
    }

    /**
     * Indicates Whether the `X-Forwarded-Clientcert-clientverify` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate to Verify the Results.
     * 
     */
    @Import(name="xForwardedForClientCertClientVerifyEnabled")
    private @Nullable Output<Boolean> xForwardedForClientCertClientVerifyEnabled;

    /**
     * @return Indicates Whether the `X-Forwarded-Clientcert-clientverify` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate to Verify the Results.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForClientCertClientVerifyEnabled() {
        return Optional.ofNullable(this.xForwardedForClientCertClientVerifyEnabled);
    }

    /**
     * The Custom Header Field Names Only When `x_forwarded_for_client_certfingerprint_enabled`, Which Evaluates to True When the Entry into Force of.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    @Import(name="xForwardedForClientCertFingerPrintAlias")
    private @Nullable Output<String> xForwardedForClientCertFingerPrintAlias;

    /**
     * @return The Custom Header Field Names Only When `x_forwarded_for_client_certfingerprint_enabled`, Which Evaluates to True When the Entry into Force of.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    public Optional<Output<String>> xForwardedForClientCertFingerPrintAlias() {
        return Optional.ofNullable(this.xForwardedForClientCertFingerPrintAlias);
    }

    /**
     * Indicates Whether the `X-Forwarded-client_cert-fingerprint` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate Fingerprint Value.
     * 
     */
    @Import(name="xForwardedForClientCertFingerPrintEnabled")
    private @Nullable Output<Boolean> xForwardedForClientCertFingerPrintEnabled;

    /**
     * @return Indicates Whether the `X-Forwarded-client_cert-fingerprint` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate Fingerprint Value.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForClientCertFingerPrintEnabled() {
        return Optional.ofNullable(this.xForwardedForClientCertFingerPrintEnabled);
    }

    /**
     * The Custom Header Field Names Only When `x_forwarded_for_client_cert_issuer_dn_enabled`, Which Evaluates to True When the Entry into Force of.
     * 
     */
    @Import(name="xForwardedForClientCertIssuerDnAlias")
    private @Nullable Output<String> xForwardedForClientCertIssuerDnAlias;

    /**
     * @return The Custom Header Field Names Only When `x_forwarded_for_client_cert_issuer_dn_enabled`, Which Evaluates to True When the Entry into Force of.
     * 
     */
    public Optional<Output<String>> xForwardedForClientCertIssuerDnAlias() {
        return Optional.ofNullable(this.xForwardedForClientCertIssuerDnAlias);
    }

    /**
     * Indicates Whether the `X-Forwarded-Clientcert-issuerdn` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate after the Manifests Are Signed, the Publisher Information.
     * 
     */
    @Import(name="xForwardedForClientCertIssuerDnEnabled")
    private @Nullable Output<Boolean> xForwardedForClientCertIssuerDnEnabled;

    /**
     * @return Indicates Whether the `X-Forwarded-Clientcert-issuerdn` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate after the Manifests Are Signed, the Publisher Information.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForClientCertIssuerDnEnabled() {
        return Optional.ofNullable(this.xForwardedForClientCertIssuerDnEnabled);
    }

    /**
     * The name of the custom header. This parameter is valid only if `x_forwarded_for_client_certsubjectdn_enabled` is set to true. The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    @Import(name="xForwardedForClientCertSubjectDnAlias")
    private @Nullable Output<String> xForwardedForClientCertSubjectDnAlias;

    /**
     * @return The name of the custom header. This parameter is valid only if `x_forwarded_for_client_certsubjectdn_enabled` is set to true. The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    public Optional<Output<String>> xForwardedForClientCertSubjectDnAlias() {
        return Optional.ofNullable(this.xForwardedForClientCertSubjectDnAlias);
    }

    /**
     * Specifies whether to use the `X-Forwarded-client_cert-subjectdn` header field to obtain information about the owner of the ALB client certificate. Valid values: true and false. Default value: false.
     * 
     */
    @Import(name="xForwardedForClientCertSubjectDnEnabled")
    private @Nullable Output<Boolean> xForwardedForClientCertSubjectDnEnabled;

    /**
     * @return Specifies whether to use the `X-Forwarded-client_cert-subjectdn` header field to obtain information about the owner of the ALB client certificate. Valid values: true and false. Default value: false.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForClientCertSubjectDnEnabled() {
        return Optional.ofNullable(this.xForwardedForClientCertSubjectDnEnabled);
    }

    /**
     * Whether to use the X-Forwarded-Client-Ip header to obtain the source IP address of the server load balancer instance. Value: true, false. Note HTTP, HTTPS, and QUIC listeners support this parameter. The function corresponding to this parameter is not open by default. Please contact the account manager if you need to use it.
     * 
     */
    @Import(name="xForwardedForClientSourceIpsEnabled")
    private @Nullable Output<Boolean> xForwardedForClientSourceIpsEnabled;

    /**
     * @return Whether to use the X-Forwarded-Client-Ip header to obtain the source IP address of the server load balancer instance. Value: true, false. Note HTTP, HTTPS, and QUIC listeners support this parameter. The function corresponding to this parameter is not open by default. Please contact the account manager if you need to use it.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForClientSourceIpsEnabled() {
        return Optional.ofNullable(this.xForwardedForClientSourceIpsEnabled);
    }

    /**
     * Specify the trusted proxy IP. Application-oriented load balancing ALB will traverse the X-Forwarded-For from back to front, and select the first IP that is not in the trusted IP list as the real client IP, which will be used for the source IP speed limit.
     * 
     */
    @Import(name="xForwardedForClientSourceIpsTrusted")
    private @Nullable Output<String> xForwardedForClientSourceIpsTrusted;

    /**
     * @return Specify the trusted proxy IP. Application-oriented load balancing ALB will traverse the X-Forwarded-For from back to front, and select the first IP that is not in the trusted IP list as the real client IP, which will be used for the source IP speed limit.
     * 
     */
    public Optional<Output<String>> xForwardedForClientSourceIpsTrusted() {
        return Optional.ofNullable(this.xForwardedForClientSourceIpsTrusted);
    }

    /**
     * Indicates Whether the X-Forwarded-Client-Port Header Field Is Used to Obtain Access to Server Load Balancer Instances to the Client, and Those of the Ports.
     * 
     */
    @Import(name="xForwardedForClientSrcPortEnabled")
    private @Nullable Output<Boolean> xForwardedForClientSrcPortEnabled;

    /**
     * @return Indicates Whether the X-Forwarded-Client-Port Header Field Is Used to Obtain Access to Server Load Balancer Instances to the Client, and Those of the Ports.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForClientSrcPortEnabled() {
        return Optional.ofNullable(this.xForwardedForClientSrcPortEnabled);
    }

    /**
     * Whether to Enable by X-Forwarded-For Header Field Is Used to Obtain the Client IP Addresses.
     * 
     */
    @Import(name="xForwardedForEnabled")
    private @Nullable Output<Boolean> xForwardedForEnabled;

    /**
     * @return Whether to Enable by X-Forwarded-For Header Field Is Used to Obtain the Client IP Addresses.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForEnabled() {
        return Optional.ofNullable(this.xForwardedForEnabled);
    }

    /**
     * Indicates Whether the X-Forwarded-Proto Header Field Is Used to Obtain the Server Load Balancer Instance Snooping Protocols.
     * 
     */
    @Import(name="xForwardedForProtoEnabled")
    private @Nullable Output<Boolean> xForwardedForProtoEnabled;

    /**
     * @return Indicates Whether the X-Forwarded-Proto Header Field Is Used to Obtain the Server Load Balancer Instance Snooping Protocols.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForProtoEnabled() {
        return Optional.ofNullable(this.xForwardedForProtoEnabled);
    }

    /**
     * Indicates Whether the SLB-ID Header Field Is Used to Obtain the Load Balancing Instance Id.
     * 
     */
    @Import(name="xForwardedForSlbIdEnabled")
    private @Nullable Output<Boolean> xForwardedForSlbIdEnabled;

    /**
     * @return Indicates Whether the SLB-ID Header Field Is Used to Obtain the Load Balancing Instance Id.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForSlbIdEnabled() {
        return Optional.ofNullable(this.xForwardedForSlbIdEnabled);
    }

    /**
     * Indicates Whether the X-Forwarded-Port Header Field Is Used to Obtain the Server Load Balancer Instance Listening Port.
     * 
     */
    @Import(name="xForwardedForSlbPortEnabled")
    private @Nullable Output<Boolean> xForwardedForSlbPortEnabled;

    /**
     * @return Indicates Whether the X-Forwarded-Port Header Field Is Used to Obtain the Server Load Balancer Instance Listening Port.
     * 
     */
    public Optional<Output<Boolean>> xForwardedForSlbPortEnabled() {
        return Optional.ofNullable(this.xForwardedForSlbPortEnabled);
    }

    private ListenerXForwardedForConfigArgs() {}

    private ListenerXForwardedForConfigArgs(ListenerXForwardedForConfigArgs $) {
        this.xForwardedForClientCertClientVerifyAlias = $.xForwardedForClientCertClientVerifyAlias;
        this.xForwardedForClientCertClientVerifyEnabled = $.xForwardedForClientCertClientVerifyEnabled;
        this.xForwardedForClientCertFingerPrintAlias = $.xForwardedForClientCertFingerPrintAlias;
        this.xForwardedForClientCertFingerPrintEnabled = $.xForwardedForClientCertFingerPrintEnabled;
        this.xForwardedForClientCertIssuerDnAlias = $.xForwardedForClientCertIssuerDnAlias;
        this.xForwardedForClientCertIssuerDnEnabled = $.xForwardedForClientCertIssuerDnEnabled;
        this.xForwardedForClientCertSubjectDnAlias = $.xForwardedForClientCertSubjectDnAlias;
        this.xForwardedForClientCertSubjectDnEnabled = $.xForwardedForClientCertSubjectDnEnabled;
        this.xForwardedForClientSourceIpsEnabled = $.xForwardedForClientSourceIpsEnabled;
        this.xForwardedForClientSourceIpsTrusted = $.xForwardedForClientSourceIpsTrusted;
        this.xForwardedForClientSrcPortEnabled = $.xForwardedForClientSrcPortEnabled;
        this.xForwardedForEnabled = $.xForwardedForEnabled;
        this.xForwardedForProtoEnabled = $.xForwardedForProtoEnabled;
        this.xForwardedForSlbIdEnabled = $.xForwardedForSlbIdEnabled;
        this.xForwardedForSlbPortEnabled = $.xForwardedForSlbPortEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerXForwardedForConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerXForwardedForConfigArgs $;

        public Builder() {
            $ = new ListenerXForwardedForConfigArgs();
        }

        public Builder(ListenerXForwardedForConfigArgs defaults) {
            $ = new ListenerXForwardedForConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param xForwardedForClientCertClientVerifyAlias The Custom Header Field Names Only When `x_forwarded_for_client_cert_client_verify_enabled` Has a Value of True, this Value Will Not Take Effect until.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertClientVerifyAlias(@Nullable Output<String> xForwardedForClientCertClientVerifyAlias) {
            $.xForwardedForClientCertClientVerifyAlias = xForwardedForClientCertClientVerifyAlias;
            return this;
        }

        /**
         * @param xForwardedForClientCertClientVerifyAlias The Custom Header Field Names Only When `x_forwarded_for_client_cert_client_verify_enabled` Has a Value of True, this Value Will Not Take Effect until.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertClientVerifyAlias(String xForwardedForClientCertClientVerifyAlias) {
            return xForwardedForClientCertClientVerifyAlias(Output.of(xForwardedForClientCertClientVerifyAlias));
        }

        /**
         * @param xForwardedForClientCertClientVerifyEnabled Indicates Whether the `X-Forwarded-Clientcert-clientverify` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate to Verify the Results.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertClientVerifyEnabled(@Nullable Output<Boolean> xForwardedForClientCertClientVerifyEnabled) {
            $.xForwardedForClientCertClientVerifyEnabled = xForwardedForClientCertClientVerifyEnabled;
            return this;
        }

        /**
         * @param xForwardedForClientCertClientVerifyEnabled Indicates Whether the `X-Forwarded-Clientcert-clientverify` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate to Verify the Results.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertClientVerifyEnabled(Boolean xForwardedForClientCertClientVerifyEnabled) {
            return xForwardedForClientCertClientVerifyEnabled(Output.of(xForwardedForClientCertClientVerifyEnabled));
        }

        /**
         * @param xForwardedForClientCertFingerPrintAlias The Custom Header Field Names Only When `x_forwarded_for_client_certfingerprint_enabled`, Which Evaluates to True When the Entry into Force of.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertFingerPrintAlias(@Nullable Output<String> xForwardedForClientCertFingerPrintAlias) {
            $.xForwardedForClientCertFingerPrintAlias = xForwardedForClientCertFingerPrintAlias;
            return this;
        }

        /**
         * @param xForwardedForClientCertFingerPrintAlias The Custom Header Field Names Only When `x_forwarded_for_client_certfingerprint_enabled`, Which Evaluates to True When the Entry into Force of.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertFingerPrintAlias(String xForwardedForClientCertFingerPrintAlias) {
            return xForwardedForClientCertFingerPrintAlias(Output.of(xForwardedForClientCertFingerPrintAlias));
        }

        /**
         * @param xForwardedForClientCertFingerPrintEnabled Indicates Whether the `X-Forwarded-client_cert-fingerprint` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate Fingerprint Value.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertFingerPrintEnabled(@Nullable Output<Boolean> xForwardedForClientCertFingerPrintEnabled) {
            $.xForwardedForClientCertFingerPrintEnabled = xForwardedForClientCertFingerPrintEnabled;
            return this;
        }

        /**
         * @param xForwardedForClientCertFingerPrintEnabled Indicates Whether the `X-Forwarded-client_cert-fingerprint` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate Fingerprint Value.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertFingerPrintEnabled(Boolean xForwardedForClientCertFingerPrintEnabled) {
            return xForwardedForClientCertFingerPrintEnabled(Output.of(xForwardedForClientCertFingerPrintEnabled));
        }

        /**
         * @param xForwardedForClientCertIssuerDnAlias The Custom Header Field Names Only When `x_forwarded_for_client_cert_issuer_dn_enabled`, Which Evaluates to True When the Entry into Force of.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertIssuerDnAlias(@Nullable Output<String> xForwardedForClientCertIssuerDnAlias) {
            $.xForwardedForClientCertIssuerDnAlias = xForwardedForClientCertIssuerDnAlias;
            return this;
        }

        /**
         * @param xForwardedForClientCertIssuerDnAlias The Custom Header Field Names Only When `x_forwarded_for_client_cert_issuer_dn_enabled`, Which Evaluates to True When the Entry into Force of.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertIssuerDnAlias(String xForwardedForClientCertIssuerDnAlias) {
            return xForwardedForClientCertIssuerDnAlias(Output.of(xForwardedForClientCertIssuerDnAlias));
        }

        /**
         * @param xForwardedForClientCertIssuerDnEnabled Indicates Whether the `X-Forwarded-Clientcert-issuerdn` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate after the Manifests Are Signed, the Publisher Information.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertIssuerDnEnabled(@Nullable Output<Boolean> xForwardedForClientCertIssuerDnEnabled) {
            $.xForwardedForClientCertIssuerDnEnabled = xForwardedForClientCertIssuerDnEnabled;
            return this;
        }

        /**
         * @param xForwardedForClientCertIssuerDnEnabled Indicates Whether the `X-Forwarded-Clientcert-issuerdn` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate after the Manifests Are Signed, the Publisher Information.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertIssuerDnEnabled(Boolean xForwardedForClientCertIssuerDnEnabled) {
            return xForwardedForClientCertIssuerDnEnabled(Output.of(xForwardedForClientCertIssuerDnEnabled));
        }

        /**
         * @param xForwardedForClientCertSubjectDnAlias The name of the custom header. This parameter is valid only if `x_forwarded_for_client_certsubjectdn_enabled` is set to true. The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertSubjectDnAlias(@Nullable Output<String> xForwardedForClientCertSubjectDnAlias) {
            $.xForwardedForClientCertSubjectDnAlias = xForwardedForClientCertSubjectDnAlias;
            return this;
        }

        /**
         * @param xForwardedForClientCertSubjectDnAlias The name of the custom header. This parameter is valid only if `x_forwarded_for_client_certsubjectdn_enabled` is set to true. The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertSubjectDnAlias(String xForwardedForClientCertSubjectDnAlias) {
            return xForwardedForClientCertSubjectDnAlias(Output.of(xForwardedForClientCertSubjectDnAlias));
        }

        /**
         * @param xForwardedForClientCertSubjectDnEnabled Specifies whether to use the `X-Forwarded-client_cert-subjectdn` header field to obtain information about the owner of the ALB client certificate. Valid values: true and false. Default value: false.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertSubjectDnEnabled(@Nullable Output<Boolean> xForwardedForClientCertSubjectDnEnabled) {
            $.xForwardedForClientCertSubjectDnEnabled = xForwardedForClientCertSubjectDnEnabled;
            return this;
        }

        /**
         * @param xForwardedForClientCertSubjectDnEnabled Specifies whether to use the `X-Forwarded-client_cert-subjectdn` header field to obtain information about the owner of the ALB client certificate. Valid values: true and false. Default value: false.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientCertSubjectDnEnabled(Boolean xForwardedForClientCertSubjectDnEnabled) {
            return xForwardedForClientCertSubjectDnEnabled(Output.of(xForwardedForClientCertSubjectDnEnabled));
        }

        /**
         * @param xForwardedForClientSourceIpsEnabled Whether to use the X-Forwarded-Client-Ip header to obtain the source IP address of the server load balancer instance. Value: true, false. Note HTTP, HTTPS, and QUIC listeners support this parameter. The function corresponding to this parameter is not open by default. Please contact the account manager if you need to use it.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientSourceIpsEnabled(@Nullable Output<Boolean> xForwardedForClientSourceIpsEnabled) {
            $.xForwardedForClientSourceIpsEnabled = xForwardedForClientSourceIpsEnabled;
            return this;
        }

        /**
         * @param xForwardedForClientSourceIpsEnabled Whether to use the X-Forwarded-Client-Ip header to obtain the source IP address of the server load balancer instance. Value: true, false. Note HTTP, HTTPS, and QUIC listeners support this parameter. The function corresponding to this parameter is not open by default. Please contact the account manager if you need to use it.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientSourceIpsEnabled(Boolean xForwardedForClientSourceIpsEnabled) {
            return xForwardedForClientSourceIpsEnabled(Output.of(xForwardedForClientSourceIpsEnabled));
        }

        /**
         * @param xForwardedForClientSourceIpsTrusted Specify the trusted proxy IP. Application-oriented load balancing ALB will traverse the X-Forwarded-For from back to front, and select the first IP that is not in the trusted IP list as the real client IP, which will be used for the source IP speed limit.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientSourceIpsTrusted(@Nullable Output<String> xForwardedForClientSourceIpsTrusted) {
            $.xForwardedForClientSourceIpsTrusted = xForwardedForClientSourceIpsTrusted;
            return this;
        }

        /**
         * @param xForwardedForClientSourceIpsTrusted Specify the trusted proxy IP. Application-oriented load balancing ALB will traverse the X-Forwarded-For from back to front, and select the first IP that is not in the trusted IP list as the real client IP, which will be used for the source IP speed limit.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientSourceIpsTrusted(String xForwardedForClientSourceIpsTrusted) {
            return xForwardedForClientSourceIpsTrusted(Output.of(xForwardedForClientSourceIpsTrusted));
        }

        /**
         * @param xForwardedForClientSrcPortEnabled Indicates Whether the X-Forwarded-Client-Port Header Field Is Used to Obtain Access to Server Load Balancer Instances to the Client, and Those of the Ports.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientSrcPortEnabled(@Nullable Output<Boolean> xForwardedForClientSrcPortEnabled) {
            $.xForwardedForClientSrcPortEnabled = xForwardedForClientSrcPortEnabled;
            return this;
        }

        /**
         * @param xForwardedForClientSrcPortEnabled Indicates Whether the X-Forwarded-Client-Port Header Field Is Used to Obtain Access to Server Load Balancer Instances to the Client, and Those of the Ports.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForClientSrcPortEnabled(Boolean xForwardedForClientSrcPortEnabled) {
            return xForwardedForClientSrcPortEnabled(Output.of(xForwardedForClientSrcPortEnabled));
        }

        /**
         * @param xForwardedForEnabled Whether to Enable by X-Forwarded-For Header Field Is Used to Obtain the Client IP Addresses.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForEnabled(@Nullable Output<Boolean> xForwardedForEnabled) {
            $.xForwardedForEnabled = xForwardedForEnabled;
            return this;
        }

        /**
         * @param xForwardedForEnabled Whether to Enable by X-Forwarded-For Header Field Is Used to Obtain the Client IP Addresses.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForEnabled(Boolean xForwardedForEnabled) {
            return xForwardedForEnabled(Output.of(xForwardedForEnabled));
        }

        /**
         * @param xForwardedForProtoEnabled Indicates Whether the X-Forwarded-Proto Header Field Is Used to Obtain the Server Load Balancer Instance Snooping Protocols.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForProtoEnabled(@Nullable Output<Boolean> xForwardedForProtoEnabled) {
            $.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
            return this;
        }

        /**
         * @param xForwardedForProtoEnabled Indicates Whether the X-Forwarded-Proto Header Field Is Used to Obtain the Server Load Balancer Instance Snooping Protocols.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
            return xForwardedForProtoEnabled(Output.of(xForwardedForProtoEnabled));
        }

        /**
         * @param xForwardedForSlbIdEnabled Indicates Whether the SLB-ID Header Field Is Used to Obtain the Load Balancing Instance Id.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForSlbIdEnabled(@Nullable Output<Boolean> xForwardedForSlbIdEnabled) {
            $.xForwardedForSlbIdEnabled = xForwardedForSlbIdEnabled;
            return this;
        }

        /**
         * @param xForwardedForSlbIdEnabled Indicates Whether the SLB-ID Header Field Is Used to Obtain the Load Balancing Instance Id.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForSlbIdEnabled(Boolean xForwardedForSlbIdEnabled) {
            return xForwardedForSlbIdEnabled(Output.of(xForwardedForSlbIdEnabled));
        }

        /**
         * @param xForwardedForSlbPortEnabled Indicates Whether the X-Forwarded-Port Header Field Is Used to Obtain the Server Load Balancer Instance Listening Port.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForSlbPortEnabled(@Nullable Output<Boolean> xForwardedForSlbPortEnabled) {
            $.xForwardedForSlbPortEnabled = xForwardedForSlbPortEnabled;
            return this;
        }

        /**
         * @param xForwardedForSlbPortEnabled Indicates Whether the X-Forwarded-Port Header Field Is Used to Obtain the Server Load Balancer Instance Listening Port.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedForSlbPortEnabled(Boolean xForwardedForSlbPortEnabled) {
            return xForwardedForSlbPortEnabled(Output.of(xForwardedForSlbPortEnabled));
        }

        public ListenerXForwardedForConfigArgs build() {
            return $;
        }
    }

}
