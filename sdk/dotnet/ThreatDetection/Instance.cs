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
    /// ## Import
    /// 
    /// Threat Detection Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:threatdetection/instance:Instance example &lt;id&gt;
    /// ```
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
        /// Container Image security scan. Interval type, value interval:[0,200000].
        /// &gt; **NOTE:**  The step size is 20, that is, only multiples of 20 can be filled in.
        /// </summary>
        [Output("containerImageScan")]
        public Output<string?> ContainerImageScan { get; private set; } = null!;

        /// <summary>
        /// Container Image security scan. Interval type, value interval:[0,200000].
        /// &gt; **NOTE:**  The step size is 20, that is, only multiples of 20 can be filled in.
        /// </summary>
        [Output("containerImageScanNew")]
        public Output<string?> ContainerImageScanNew { get; private set; } = null!;

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Number of cloud honeypot licenses. Interval type, value interval:[20,500].
        /// &gt; **NOTE:**  This module can only be purchased when honeypot_switch = 1, starting with 20.
        /// </summary>
        [Output("honeypot")]
        public Output<string?> Honeypot { get; private set; } = null!;

        /// <summary>
        /// Cloud honeypot. Value:
        /// - 1: Yes.
        /// - 2: No.
        /// </summary>
        [Output("honeypotSwitch")]
        public Output<string> HoneypotSwitch { get; private set; } = null!;

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
        /// Prepaid cycle. The unit is Monthly, please enter an integer multiple of 12 for annual paid products.
        /// &gt; **NOTE:**  must be set when creating a prepaid instance.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Number of application protection licenses. Interval type, value interval:[1,100000000].
        /// </summary>
        [Output("raspCount")]
        public Output<string?> RaspCount { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal cycle, in months.
        /// &gt; **NOTE:**  When **RenewalStatus** is set to **AutoRenewal**, it must be set.
        /// </summary>
        [Output("renewPeriod")]
        public Output<int> RenewPeriod { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal period unit, value:
        /// - M: month.
        /// - Y: years.
        /// &gt; **NOTE:**  Must be set when RenewalStatus = AutoRenewal.
        /// </summary>
        [Output("renewalPeriodUnit")]
        public Output<string> RenewalPeriodUnit { get; private set; } = null!;

        /// <summary>
        /// Automatic renewal status, default ManualRenewal, valid values:
        /// - AutoRenewal: automatic renewal.
        /// - ManualRenewal: manual renewal.
        /// </summary>
        [Output("renewalStatus")]
        public Output<string?> RenewalStatus { get; private set; } = null!;

        /// <summary>
        /// Anti-ransomware capacity. Unit: GB. Interval type, value interval:[0,9999999999].
        /// &gt; **NOTE:**  The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Output("sasAntiRansomware")]
        public Output<string?> SasAntiRansomware { get; private set; } = null!;

        /// <summary>
        /// Cloud platform configuration check scan times, interval type, value range:[1000,9999999999].
        /// &gt; **NOTE:**  You must have sas_cspm_switch = 1 to purchase this module. The step size is 100, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Output("sasCspm")]
        public Output<string?> SasCspm { get; private set; } = null!;

        /// <summary>
        /// Cloud platform configuration check switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Output("sasCspmSwitch")]
        public Output<string> SasCspmSwitch { get; private set; } = null!;

        /// <summary>
        /// Security screen. Value:
        /// - true: Yes.
        /// - false: No.
        /// </summary>
        [Output("sasSc")]
        public Output<bool?> SasSc { get; private set; } = null!;

        /// <summary>
        /// Number of malicious file detections. Unit: 10,000 times. Interval type, value interval:[10,9999999999].
        /// &gt; **NOTE:**  This module can only be purchased when sas_sdk_switch = 1. The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Output("sasSdk")]
        public Output<string?> SasSdk { get; private set; } = null!;

        /// <summary>
        /// Malicious file detection SDK.
        /// </summary>
        [Output("sasSdkSwitch")]
        public Output<string> SasSdkSwitch { get; private set; } = null!;

        /// <summary>
        /// Log analysis storage capacity. Unit: GB. Interval type, value interval:[0,600000].
        /// &gt; **NOTE:**  The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Output("sasSlsStorage")]
        public Output<string?> SasSlsStorage { get; private set; } = null!;

        /// <summary>
        /// Web tamper-proof switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Output("sasWebguardBoolean")]
        public Output<string> SasWebguardBoolean { get; private set; } = null!;

        /// <summary>
        /// Tamper-proof authorization number. Value:
        /// - 0: No
        /// - 1: Yes.
        /// </summary>
        [Output("sasWebguardOrderNum")]
        public Output<string?> SasWebguardOrderNum { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Threat Analysis log storage capacity. Interval type, value interval:[0,9999999999].
        /// &gt; **NOTE:**  This module can only be purchased when Threat_analysis_switch = 1. The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Output("threatAnalysis")]
        public Output<string?> ThreatAnalysis { get; private set; } = null!;

        /// <summary>
        /// Threat analysis. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Output("threatAnalysisSwitch")]
        public Output<string> ThreatAnalysisSwitch { get; private set; } = null!;

        /// <summary>
        /// Number of cores.
        /// </summary>
        [Output("vCore")]
        public Output<string?> VCore { get; private set; } = null!;

        /// <summary>
        /// Select the security center version. Value:
        /// - level7: Antivirus Edition.
        /// - level3: Premium version.
        /// - level2: Enterprise Edition.
        /// - level8: Ultimate.
        /// - level10: Purchase value-added services only.
        /// </summary>
        [Output("versionCode")]
        public Output<string> VersionCode { get; private set; } = null!;

        /// <summary>
        /// Vulnerability repair times, interval type, value range:[20,100000000].
        /// &gt; **NOTE:**  This module can only be purchased when vul_switch = 1. Only when the version_code value is level7 or level10. other versions do not need to be purchased separately.
        /// </summary>
        [Output("vulCount")]
        public Output<string?> VulCount { get; private set; } = null!;

        /// <summary>
        /// Vulnerability fix switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// &gt; **NOTE:**  When the value of version_code is level7 or level10, the purchase is allowed. Other versions do not need to be purchased separately.
        /// </summary>
        [Output("vulSwitch")]
        public Output<string> VulSwitch { get; private set; } = null!;


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
        /// Container Image security scan. Interval type, value interval:[0,200000].
        /// &gt; **NOTE:**  The step size is 20, that is, only multiples of 20 can be filled in.
        /// </summary>
        [Input("containerImageScan")]
        public Input<string>? ContainerImageScan { get; set; }

        /// <summary>
        /// Container Image security scan. Interval type, value interval:[0,200000].
        /// &gt; **NOTE:**  The step size is 20, that is, only multiples of 20 can be filled in.
        /// </summary>
        [Input("containerImageScanNew")]
        public Input<string>? ContainerImageScanNew { get; set; }

        /// <summary>
        /// Number of cloud honeypot licenses. Interval type, value interval:[20,500].
        /// &gt; **NOTE:**  This module can only be purchased when honeypot_switch = 1, starting with 20.
        /// </summary>
        [Input("honeypot")]
        public Input<string>? Honeypot { get; set; }

        /// <summary>
        /// Cloud honeypot. Value:
        /// - 1: Yes.
        /// - 2: No.
        /// </summary>
        [Input("honeypotSwitch")]
        public Input<string>? HoneypotSwitch { get; set; }

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
        /// Prepaid cycle. The unit is Monthly, please enter an integer multiple of 12 for annual paid products.
        /// &gt; **NOTE:**  must be set when creating a prepaid instance.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Number of application protection licenses. Interval type, value interval:[1,100000000].
        /// </summary>
        [Input("raspCount")]
        public Input<string>? RaspCount { get; set; }

        /// <summary>
        /// Automatic renewal cycle, in months.
        /// &gt; **NOTE:**  When **RenewalStatus** is set to **AutoRenewal**, it must be set.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Automatic renewal period unit, value:
        /// - M: month.
        /// - Y: years.
        /// &gt; **NOTE:**  Must be set when RenewalStatus = AutoRenewal.
        /// </summary>
        [Input("renewalPeriodUnit")]
        public Input<string>? RenewalPeriodUnit { get; set; }

        /// <summary>
        /// Automatic renewal status, default ManualRenewal, valid values:
        /// - AutoRenewal: automatic renewal.
        /// - ManualRenewal: manual renewal.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// Anti-ransomware capacity. Unit: GB. Interval type, value interval:[0,9999999999].
        /// &gt; **NOTE:**  The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("sasAntiRansomware")]
        public Input<string>? SasAntiRansomware { get; set; }

        /// <summary>
        /// Cloud platform configuration check scan times, interval type, value range:[1000,9999999999].
        /// &gt; **NOTE:**  You must have sas_cspm_switch = 1 to purchase this module. The step size is 100, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("sasCspm")]
        public Input<string>? SasCspm { get; set; }

        /// <summary>
        /// Cloud platform configuration check switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Input("sasCspmSwitch")]
        public Input<string>? SasCspmSwitch { get; set; }

        /// <summary>
        /// Security screen. Value:
        /// - true: Yes.
        /// - false: No.
        /// </summary>
        [Input("sasSc")]
        public Input<bool>? SasSc { get; set; }

        /// <summary>
        /// Number of malicious file detections. Unit: 10,000 times. Interval type, value interval:[10,9999999999].
        /// &gt; **NOTE:**  This module can only be purchased when sas_sdk_switch = 1. The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("sasSdk")]
        public Input<string>? SasSdk { get; set; }

        /// <summary>
        /// Malicious file detection SDK.
        /// </summary>
        [Input("sasSdkSwitch")]
        public Input<string>? SasSdkSwitch { get; set; }

        /// <summary>
        /// Log analysis storage capacity. Unit: GB. Interval type, value interval:[0,600000].
        /// &gt; **NOTE:**  The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("sasSlsStorage")]
        public Input<string>? SasSlsStorage { get; set; }

        /// <summary>
        /// Web tamper-proof switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Input("sasWebguardBoolean")]
        public Input<string>? SasWebguardBoolean { get; set; }

        /// <summary>
        /// Tamper-proof authorization number. Value:
        /// - 0: No
        /// - 1: Yes.
        /// </summary>
        [Input("sasWebguardOrderNum")]
        public Input<string>? SasWebguardOrderNum { get; set; }

        /// <summary>
        /// Threat Analysis log storage capacity. Interval type, value interval:[0,9999999999].
        /// &gt; **NOTE:**  This module can only be purchased when Threat_analysis_switch = 1. The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("threatAnalysis")]
        public Input<string>? ThreatAnalysis { get; set; }

        /// <summary>
        /// Threat analysis. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Input("threatAnalysisSwitch")]
        public Input<string>? ThreatAnalysisSwitch { get; set; }

        /// <summary>
        /// Number of cores.
        /// </summary>
        [Input("vCore")]
        public Input<string>? VCore { get; set; }

        /// <summary>
        /// Select the security center version. Value:
        /// - level7: Antivirus Edition.
        /// - level3: Premium version.
        /// - level2: Enterprise Edition.
        /// - level8: Ultimate.
        /// - level10: Purchase value-added services only.
        /// </summary>
        [Input("versionCode", required: true)]
        public Input<string> VersionCode { get; set; } = null!;

        /// <summary>
        /// Vulnerability repair times, interval type, value range:[20,100000000].
        /// &gt; **NOTE:**  This module can only be purchased when vul_switch = 1. Only when the version_code value is level7 or level10. other versions do not need to be purchased separately.
        /// </summary>
        [Input("vulCount")]
        public Input<string>? VulCount { get; set; }

        /// <summary>
        /// Vulnerability fix switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// &gt; **NOTE:**  When the value of version_code is level7 or level10, the purchase is allowed. Other versions do not need to be purchased separately.
        /// </summary>
        [Input("vulSwitch")]
        public Input<string>? VulSwitch { get; set; }

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
        /// Container Image security scan. Interval type, value interval:[0,200000].
        /// &gt; **NOTE:**  The step size is 20, that is, only multiples of 20 can be filled in.
        /// </summary>
        [Input("containerImageScan")]
        public Input<string>? ContainerImageScan { get; set; }

        /// <summary>
        /// Container Image security scan. Interval type, value interval:[0,200000].
        /// &gt; **NOTE:**  The step size is 20, that is, only multiples of 20 can be filled in.
        /// </summary>
        [Input("containerImageScanNew")]
        public Input<string>? ContainerImageScanNew { get; set; }

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Number of cloud honeypot licenses. Interval type, value interval:[20,500].
        /// &gt; **NOTE:**  This module can only be purchased when honeypot_switch = 1, starting with 20.
        /// </summary>
        [Input("honeypot")]
        public Input<string>? Honeypot { get; set; }

        /// <summary>
        /// Cloud honeypot. Value:
        /// - 1: Yes.
        /// - 2: No.
        /// </summary>
        [Input("honeypotSwitch")]
        public Input<string>? HoneypotSwitch { get; set; }

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
        /// Prepaid cycle. The unit is Monthly, please enter an integer multiple of 12 for annual paid products.
        /// &gt; **NOTE:**  must be set when creating a prepaid instance.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Number of application protection licenses. Interval type, value interval:[1,100000000].
        /// </summary>
        [Input("raspCount")]
        public Input<string>? RaspCount { get; set; }

        /// <summary>
        /// Automatic renewal cycle, in months.
        /// &gt; **NOTE:**  When **RenewalStatus** is set to **AutoRenewal**, it must be set.
        /// </summary>
        [Input("renewPeriod")]
        public Input<int>? RenewPeriod { get; set; }

        /// <summary>
        /// Automatic renewal period unit, value:
        /// - M: month.
        /// - Y: years.
        /// &gt; **NOTE:**  Must be set when RenewalStatus = AutoRenewal.
        /// </summary>
        [Input("renewalPeriodUnit")]
        public Input<string>? RenewalPeriodUnit { get; set; }

        /// <summary>
        /// Automatic renewal status, default ManualRenewal, valid values:
        /// - AutoRenewal: automatic renewal.
        /// - ManualRenewal: manual renewal.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// Anti-ransomware capacity. Unit: GB. Interval type, value interval:[0,9999999999].
        /// &gt; **NOTE:**  The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("sasAntiRansomware")]
        public Input<string>? SasAntiRansomware { get; set; }

        /// <summary>
        /// Cloud platform configuration check scan times, interval type, value range:[1000,9999999999].
        /// &gt; **NOTE:**  You must have sas_cspm_switch = 1 to purchase this module. The step size is 100, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("sasCspm")]
        public Input<string>? SasCspm { get; set; }

        /// <summary>
        /// Cloud platform configuration check switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Input("sasCspmSwitch")]
        public Input<string>? SasCspmSwitch { get; set; }

        /// <summary>
        /// Security screen. Value:
        /// - true: Yes.
        /// - false: No.
        /// </summary>
        [Input("sasSc")]
        public Input<bool>? SasSc { get; set; }

        /// <summary>
        /// Number of malicious file detections. Unit: 10,000 times. Interval type, value interval:[10,9999999999].
        /// &gt; **NOTE:**  This module can only be purchased when sas_sdk_switch = 1. The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("sasSdk")]
        public Input<string>? SasSdk { get; set; }

        /// <summary>
        /// Malicious file detection SDK.
        /// </summary>
        [Input("sasSdkSwitch")]
        public Input<string>? SasSdkSwitch { get; set; }

        /// <summary>
        /// Log analysis storage capacity. Unit: GB. Interval type, value interval:[0,600000].
        /// &gt; **NOTE:**  The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("sasSlsStorage")]
        public Input<string>? SasSlsStorage { get; set; }

        /// <summary>
        /// Web tamper-proof switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Input("sasWebguardBoolean")]
        public Input<string>? SasWebguardBoolean { get; set; }

        /// <summary>
        /// Tamper-proof authorization number. Value:
        /// - 0: No
        /// - 1: Yes.
        /// </summary>
        [Input("sasWebguardOrderNum")]
        public Input<string>? SasWebguardOrderNum { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Threat Analysis log storage capacity. Interval type, value interval:[0,9999999999].
        /// &gt; **NOTE:**  This module can only be purchased when Threat_analysis_switch = 1. The step size is 10, that is, only multiples of 10 can be filled in.
        /// </summary>
        [Input("threatAnalysis")]
        public Input<string>? ThreatAnalysis { get; set; }

        /// <summary>
        /// Threat analysis. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// </summary>
        [Input("threatAnalysisSwitch")]
        public Input<string>? ThreatAnalysisSwitch { get; set; }

        /// <summary>
        /// Number of cores.
        /// </summary>
        [Input("vCore")]
        public Input<string>? VCore { get; set; }

        /// <summary>
        /// Select the security center version. Value:
        /// - level7: Antivirus Edition.
        /// - level3: Premium version.
        /// - level2: Enterprise Edition.
        /// - level8: Ultimate.
        /// - level10: Purchase value-added services only.
        /// </summary>
        [Input("versionCode")]
        public Input<string>? VersionCode { get; set; }

        /// <summary>
        /// Vulnerability repair times, interval type, value range:[20,100000000].
        /// &gt; **NOTE:**  This module can only be purchased when vul_switch = 1. Only when the version_code value is level7 or level10. other versions do not need to be purchased separately.
        /// </summary>
        [Input("vulCount")]
        public Input<string>? VulCount { get; set; }

        /// <summary>
        /// Vulnerability fix switch. Value:
        /// - 0: No.
        /// - 1: Yes.
        /// &gt; **NOTE:**  When the value of version_code is level7 or level10, the purchase is allowed. Other versions do not need to be purchased separately.
        /// </summary>
        [Input("vulSwitch")]
        public Input<string>? VulSwitch { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
