// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection
{
    /// <summary>
    /// Provides a Threat Detection Instance resource.
    /// 
    /// For information about Threat Detection Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/en/security-center/latest/what-is-security-center).
    /// 
    /// &gt; **NOTE:** Available in v1.199.0+.
    /// 
    /// ## Import
    /// 
    /// Threat Detection Instance do not support import.
    /// </summary>
    [AliCloudResourceType("alicloud:threatdetection/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Number of servers.
        /// </summary>
        [Output("buyNumber")]
        public Output<string?> BuyNumber { get; private set; } = null!;

        /// <summary>
        /// Container Image security scan.
        /// </summary>
        [Output("containerImageScan")]
        public Output<string?> ContainerImageScan { get; private set; } = null!;

        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Cloud honeypot authorization number.
        /// </summary>
        [Output("honeypot")]
        public Output<string?> Honeypot { get; private set; } = null!;

        /// <summary>
        /// Cloud honeypot. Valid values: `1`, `2`.
        /// </summary>
        [Output("honeypotSwitch")]
        public Output<string?> HoneypotSwitch { get; private set; } = null!;

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Change configuration type, value
        /// - Upgrade: Upgrade.
        /// - Downgrade: Downgrade.
        /// </summary>
        [Output("modifyType")]
        public Output<string?> ModifyType { get; private set; } = null!;

        /// <summary>
        /// The payment type of the resource.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// Prepaid cycle. The unit is Monthly, please enter an integer multiple of 12 for annual paid products. **NOTE:** must be set when creating a prepaid instance.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal cycle, in months. **NOTE:** The `renew_period` is required under the condition that `renewal_status` is `AutoRenewal`.
        /// </summary>
        [Output("renewPeriod")]
        public Output<int?> RenewPeriod { get; private set; } = null!;

        /// <summary>
        /// The unit of the auto-renewal period. **NOTE:** The `renewal_period_unit` is required under the condition that `renewal_status` is `AutoRenewal`. Valid values:
        /// </summary>
        [Output("renewalPeriodUnit")]
        public Output<string> RenewalPeriodUnit { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal status, Default ManualRenewal. value:
        /// </summary>
        [Output("renewalStatus")]
        public Output<string> RenewalStatus { get; private set; } = null!;

        /// <summary>
        /// Anti-extortion.
        /// </summary>
        [Output("sasAntiRansomware")]
        public Output<string?> SasAntiRansomware { get; private set; } = null!;

        /// <summary>
        /// Large security screen.
        /// </summary>
        [Output("sasSc")]
        public Output<bool?> SasSc { get; private set; } = null!;

        /// <summary>
        /// Number of malicious file detections.
        /// </summary>
        [Output("sasSdk")]
        public Output<string?> SasSdk { get; private set; } = null!;

        /// <summary>
        /// Malicious file detection SDK. Valid values: `0`, `1`.
        /// </summary>
        [Output("sasSdkSwitch")]
        public Output<string?> SasSdkSwitch { get; private set; } = null!;

        /// <summary>
        /// Log analysis.
        /// </summary>
        [Output("sasSlsStorage")]
        public Output<string?> SasSlsStorage { get; private set; } = null!;

        /// <summary>
        /// Web page tamper-proof.  Valid values: `0`, `1`.
        /// </summary>
        [Output("sasWebguardBoolean")]
        public Output<string?> SasWebguardBoolean { get; private set; } = null!;

        /// <summary>
        /// Number of tamper-proof authorizations.
        /// </summary>
        [Output("sasWebguardOrderNum")]
        public Output<string?> SasWebguardOrderNum { get; private set; } = null!;

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The amount of threat analysis log storage.
        /// </summary>
        [Output("threatAnalysis")]
        public Output<string?> ThreatAnalysis { get; private set; } = null!;

        /// <summary>
        /// Threat analysis.  Valid values: `0`, `1`.
        /// </summary>
        [Output("threatAnalysisSwitch")]
        public Output<string?> ThreatAnalysisSwitch { get; private set; } = null!;

        /// <summary>
        /// Number of cores.
        /// </summary>
        [Output("vCore")]
        public Output<string?> VCore { get; private set; } = null!;

        /// <summary>
        /// Version selection. Valid values: `level10`, `level2`, `level3`, `level7`, `level8`.
        /// </summary>
        [Output("versionCode")]
        public Output<string> VersionCode { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:threatdetection/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:threatdetection/instance:Instance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of servers.
        /// </summary>
        [Input("buyNumber")]
        public Input<string>? BuyNumber { get; set; }

        /// <summary>
        /// Container Image security scan.
        /// </summary>
        [Input("containerImageScan")]
        public Input<string>? ContainerImageScan { get; set; }

        /// <summary>
        /// Cloud honeypot authorization number.
        /// </summary>
        [Input("honeypot")]
        public Input<string>? Honeypot { get; set; }

        /// <summary>
        /// Cloud honeypot. Valid values: `1`, `2`.
        /// </summary>
        [Input("honeypotSwitch")]
        public Input<string>? HoneypotSwitch { get; set; }

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Change configuration type, value
        /// - Upgrade: Upgrade.
        /// - Downgrade: Downgrade.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        /// <summary>
        /// The payment type of the resource.
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// Prepaid cycle. The unit is Monthly, please enter an integer multiple of 12 for annual paid products. **NOTE:** must be set when creating a prepaid instance.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Automatic renewal cycle, in months. **NOTE:** The `renew_period` is required under the condition that `renewal_status` is `AutoRenewal`.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// The unit of the auto-renewal period. **NOTE:** The `renewal_period_unit` is required under the condition that `renewal_status` is `AutoRenewal`. Valid values:
        /// </summary>
        [Input("renewalPeriodUnit")]
        public Input<string>? RenewalPeriodUnit { get; set; }

        /// <summary>
        /// Automatic renewal status, Default ManualRenewal. value:
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// Anti-extortion.
        /// </summary>
        [Input("sasAntiRansomware")]
        public Input<string>? SasAntiRansomware { get; set; }

        /// <summary>
        /// Large security screen.
        /// </summary>
        [Input("sasSc")]
        public Input<bool>? SasSc { get; set; }

        /// <summary>
        /// Number of malicious file detections.
        /// </summary>
        [Input("sasSdk")]
        public Input<string>? SasSdk { get; set; }

        /// <summary>
        /// Malicious file detection SDK. Valid values: `0`, `1`.
        /// </summary>
        [Input("sasSdkSwitch")]
        public Input<string>? SasSdkSwitch { get; set; }

        /// <summary>
        /// Log analysis.
        /// </summary>
        [Input("sasSlsStorage")]
        public Input<string>? SasSlsStorage { get; set; }

        /// <summary>
        /// Web page tamper-proof.  Valid values: `0`, `1`.
        /// </summary>
        [Input("sasWebguardBoolean")]
        public Input<string>? SasWebguardBoolean { get; set; }

        /// <summary>
        /// Number of tamper-proof authorizations.
        /// </summary>
        [Input("sasWebguardOrderNum")]
        public Input<string>? SasWebguardOrderNum { get; set; }

        /// <summary>
        /// The amount of threat analysis log storage.
        /// </summary>
        [Input("threatAnalysis")]
        public Input<string>? ThreatAnalysis { get; set; }

        /// <summary>
        /// Threat analysis.  Valid values: `0`, `1`.
        /// </summary>
        [Input("threatAnalysisSwitch")]
        public Input<string>? ThreatAnalysisSwitch { get; set; }

        /// <summary>
        /// Number of cores.
        /// </summary>
        [Input("vCore")]
        public Input<string>? VCore { get; set; }

        /// <summary>
        /// Version selection. Valid values: `level10`, `level2`, `level3`, `level7`, `level8`.
        /// </summary>
        [Input("versionCode", required: true)]
        public Input<string> VersionCode { get; set; } = null!;

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of servers.
        /// </summary>
        [Input("buyNumber")]
        public Input<string>? BuyNumber { get; set; }

        /// <summary>
        /// Container Image security scan.
        /// </summary>
        [Input("containerImageScan")]
        public Input<string>? ContainerImageScan { get; set; }

        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Cloud honeypot authorization number.
        /// </summary>
        [Input("honeypot")]
        public Input<string>? Honeypot { get; set; }

        /// <summary>
        /// Cloud honeypot. Valid values: `1`, `2`.
        /// </summary>
        [Input("honeypotSwitch")]
        public Input<string>? HoneypotSwitch { get; set; }

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Change configuration type, value
        /// - Upgrade: Upgrade.
        /// - Downgrade: Downgrade.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        /// <summary>
        /// The payment type of the resource.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Prepaid cycle. The unit is Monthly, please enter an integer multiple of 12 for annual paid products. **NOTE:** must be set when creating a prepaid instance.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Automatic renewal cycle, in months. **NOTE:** The `renew_period` is required under the condition that `renewal_status` is `AutoRenewal`.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// The unit of the auto-renewal period. **NOTE:** The `renewal_period_unit` is required under the condition that `renewal_status` is `AutoRenewal`. Valid values:
        /// </summary>
        [Input("renewalPeriodUnit")]
        public Input<string>? RenewalPeriodUnit { get; set; }

        /// <summary>
        /// Automatic renewal status, Default ManualRenewal. value:
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// Anti-extortion.
        /// </summary>
        [Input("sasAntiRansomware")]
        public Input<string>? SasAntiRansomware { get; set; }

        /// <summary>
        /// Large security screen.
        /// </summary>
        [Input("sasSc")]
        public Input<bool>? SasSc { get; set; }

        /// <summary>
        /// Number of malicious file detections.
        /// </summary>
        [Input("sasSdk")]
        public Input<string>? SasSdk { get; set; }

        /// <summary>
        /// Malicious file detection SDK. Valid values: `0`, `1`.
        /// </summary>
        [Input("sasSdkSwitch")]
        public Input<string>? SasSdkSwitch { get; set; }

        /// <summary>
        /// Log analysis.
        /// </summary>
        [Input("sasSlsStorage")]
        public Input<string>? SasSlsStorage { get; set; }

        /// <summary>
        /// Web page tamper-proof.  Valid values: `0`, `1`.
        /// </summary>
        [Input("sasWebguardBoolean")]
        public Input<string>? SasWebguardBoolean { get; set; }

        /// <summary>
        /// Number of tamper-proof authorizations.
        /// </summary>
        [Input("sasWebguardOrderNum")]
        public Input<string>? SasWebguardOrderNum { get; set; }

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The amount of threat analysis log storage.
        /// </summary>
        [Input("threatAnalysis")]
        public Input<string>? ThreatAnalysis { get; set; }

        /// <summary>
        /// Threat analysis.  Valid values: `0`, `1`.
        /// </summary>
        [Input("threatAnalysisSwitch")]
        public Input<string>? ThreatAnalysisSwitch { get; set; }

        /// <summary>
        /// Number of cores.
        /// </summary>
        [Input("vCore")]
        public Input<string>? VCore { get; set; }

        /// <summary>
        /// Version selection. Valid values: `level10`, `level2`, `level3`, `level7`, `level8`.
        /// </summary>
        [Input("versionCode")]
        public Input<string>? VersionCode { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
