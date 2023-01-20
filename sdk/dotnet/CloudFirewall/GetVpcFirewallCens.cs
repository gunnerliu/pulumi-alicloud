// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall
{
    public static class GetVpcFirewallCens
    {
        /// <summary>
        /// This data source provides Cloud Firewall Vpc Firewall Cen available to the user.[What is Vpc Firewall Cen](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallcenlist)
        /// 
        /// &gt; **NOTE:** Available in 1.194.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.CloudFirewall.GetVpcFirewallCens.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             alicloud_cloud_firewall_vpc_firewall_cen.Default.Id,
        ///         },
        ///         CenId = "cen-cjok7uyb5w2b27573v",
        ///         MemberUid = "1415189284827022",
        ///         Status = "closed",
        ///         VpcFirewallName = "tf-test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudCloudFirewallVpcFirewallCenExampleId"] = @default.Apply(getVpcFirewallCensResult =&gt; getVpcFirewallCensResult).Apply(@default =&gt; @default.Apply(getVpcFirewallCensResult =&gt; getVpcFirewallCensResult.Cens[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVpcFirewallCensResult> InvokeAsync(GetVpcFirewallCensArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcFirewallCensResult>("alicloud:cloudfirewall/getVpcFirewallCens:getVpcFirewallCens", args ?? new GetVpcFirewallCensArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Cloud Firewall Vpc Firewall Cen available to the user.[What is Vpc Firewall Cen](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallcenlist)
        /// 
        /// &gt; **NOTE:** Available in 1.194.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.CloudFirewall.GetVpcFirewallCens.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             alicloud_cloud_firewall_vpc_firewall_cen.Default.Id,
        ///         },
        ///         CenId = "cen-cjok7uyb5w2b27573v",
        ///         MemberUid = "1415189284827022",
        ///         Status = "closed",
        ///         VpcFirewallName = "tf-test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudCloudFirewallVpcFirewallCenExampleId"] = @default.Apply(getVpcFirewallCensResult =&gt; getVpcFirewallCensResult).Apply(@default =&gt; @default.Apply(getVpcFirewallCensResult =&gt; getVpcFirewallCensResult.Cens[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVpcFirewallCensResult> Invoke(GetVpcFirewallCensInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcFirewallCensResult>("alicloud:cloudfirewall/getVpcFirewallCens:getVpcFirewallCens", args ?? new GetVpcFirewallCensInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcFirewallCensArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("cenId")]
        public string? CenId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Vpc Firewall Cen IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The language type of the requested and received messages. Value:-**zh** (default): Chinese.-**en**: English.
        /// </summary>
        [Input("lang")]
        public string? Lang { get; set; }

        /// <summary>
        /// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
        /// </summary>
        [Input("memberUid")]
        public string? MemberUid { get; set; }

        /// <summary>
        /// The ID of the VPC instance that created the VPC firewall.
        /// </summary>
        [Input("networkInstanceId")]
        public string? NetworkInstanceId { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// Firewall switch status
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// VPC firewall ID
        /// </summary>
        [Input("vpcFirewallId")]
        public string? VpcFirewallId { get; set; }

        /// <summary>
        /// The name of the VPC firewall instance.
        /// </summary>
        [Input("vpcFirewallName")]
        public string? VpcFirewallName { get; set; }

        public GetVpcFirewallCensArgs()
        {
        }
        public static new GetVpcFirewallCensArgs Empty => new GetVpcFirewallCensArgs();
    }

    public sealed class GetVpcFirewallCensInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Vpc Firewall Cen IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The language type of the requested and received messages. Value:-**zh** (default): Chinese.-**en**: English.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
        /// </summary>
        [Input("memberUid")]
        public Input<string>? MemberUid { get; set; }

        /// <summary>
        /// The ID of the VPC instance that created the VPC firewall.
        /// </summary>
        [Input("networkInstanceId")]
        public Input<string>? NetworkInstanceId { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// Firewall switch status
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// VPC firewall ID
        /// </summary>
        [Input("vpcFirewallId")]
        public Input<string>? VpcFirewallId { get; set; }

        /// <summary>
        /// The name of the VPC firewall instance.
        /// </summary>
        [Input("vpcFirewallName")]
        public Input<string>? VpcFirewallName { get; set; }

        public GetVpcFirewallCensInvokeArgs()
        {
        }
        public static new GetVpcFirewallCensInvokeArgs Empty => new GetVpcFirewallCensInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcFirewallCensResult
    {
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        public readonly string? CenId;
        /// <summary>
        /// A list of Vpc Firewall Cen Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpcFirewallCensCenResult> Cens;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Vpc Firewall Cen IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? Lang;
        /// <summary>
        /// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
        /// </summary>
        public readonly string? MemberUid;
        /// <summary>
        /// The ID of the VPC instance that created the VPC firewall.
        /// </summary>
        public readonly string? NetworkInstanceId;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        /// <summary>
        /// Firewall switch status
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// VPC firewall ID
        /// </summary>
        public readonly string? VpcFirewallId;
        /// <summary>
        /// The name of the VPC firewall instance.
        /// </summary>
        public readonly string? VpcFirewallName;

        [OutputConstructor]
        private GetVpcFirewallCensResult(
            string? cenId,

            ImmutableArray<Outputs.GetVpcFirewallCensCenResult> cens,

            string id,

            ImmutableArray<string> ids,

            string? lang,

            string? memberUid,

            string? networkInstanceId,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? status,

            string? vpcFirewallId,

            string? vpcFirewallName)
        {
            CenId = cenId;
            Cens = cens;
            Id = id;
            Ids = ids;
            Lang = lang;
            MemberUid = memberUid;
            NetworkInstanceId = networkInstanceId;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            Status = status;
            VpcFirewallId = vpcFirewallId;
            VpcFirewallName = vpcFirewallName;
        }
    }
}
