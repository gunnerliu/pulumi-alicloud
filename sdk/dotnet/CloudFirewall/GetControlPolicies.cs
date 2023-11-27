// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall
{
    public static class GetControlPolicies
    {
        /// <summary>
        /// This data source provides the Cloud Firewall Control Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.129.0.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.CloudFirewall.GetControlPolicies.Invoke(new()
        ///     {
        ///         Direction = "in",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetControlPoliciesResult> InvokeAsync(GetControlPoliciesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetControlPoliciesResult>("alicloud:cloudfirewall/getControlPolicies:getControlPolicies", args ?? new GetControlPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Firewall Control Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.129.0.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = AliCloud.CloudFirewall.GetControlPolicies.Invoke(new()
        ///     {
        ///         Direction = "in",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetControlPoliciesResult> Invoke(GetControlPoliciesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetControlPoliciesResult>("alicloud:cloudfirewall/getControlPolicies:getControlPolicies", args ?? new GetControlPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetControlPoliciesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
        /// </summary>
        [Input("aclAction")]
        public string? AclAction { get; set; }

        /// <summary>
        /// The unique ID of the access control policy.
        /// </summary>
        [Input("aclUuid")]
        public string? AclUuid { get; set; }

        /// <summary>
        /// The description of the access control policy.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// The destination address defined in the access control policy.
        /// </summary>
        [Input("destination")]
        public string? Destination { get; set; }

        /// <summary>
        /// The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
        /// </summary>
        [Input("direction", required: true)]
        public string Direction { get; set; } = null!;

        /// <summary>
        /// The IP version of the address in the access control policy.
        /// </summary>
        [Input("ipVersion")]
        public string? IpVersion { get; set; }

        /// <summary>
        /// The language of the content within the response. Valid values: `en`, `zh`.
        /// </summary>
        [Input("lang")]
        public string? Lang { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The type of the protocol in the access control policy. Valid values: If `direction` is  `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
        /// </summary>
        [Input("proto")]
        public string? Proto { get; set; }

        /// <summary>
        /// The source address in the access control policy.
        /// </summary>
        [Input("source")]
        public string? Source { get; set; }

        public GetControlPoliciesArgs()
        {
        }
        public static new GetControlPoliciesArgs Empty => new GetControlPoliciesArgs();
    }

    public sealed class GetControlPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
        /// </summary>
        [Input("aclAction")]
        public Input<string>? AclAction { get; set; }

        /// <summary>
        /// The unique ID of the access control policy.
        /// </summary>
        [Input("aclUuid")]
        public Input<string>? AclUuid { get; set; }

        /// <summary>
        /// The description of the access control policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The destination address defined in the access control policy.
        /// </summary>
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        /// <summary>
        /// The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// The IP version of the address in the access control policy.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// The language of the content within the response. Valid values: `en`, `zh`.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The type of the protocol in the access control policy. Valid values: If `direction` is  `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
        /// </summary>
        [Input("proto")]
        public Input<string>? Proto { get; set; }

        /// <summary>
        /// The source address in the access control policy.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        public GetControlPoliciesInvokeArgs()
        {
        }
        public static new GetControlPoliciesInvokeArgs Empty => new GetControlPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetControlPoliciesResult
    {
        /// <summary>
        /// The action that Cloud Firewall performs on the traffic.
        /// </summary>
        public readonly string? AclAction;
        /// <summary>
        /// The unique ID of the access control policy.
        /// </summary>
        public readonly string? AclUuid;
        /// <summary>
        /// The description of the access control policy.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The destination address in the access control policy.
        /// </summary>
        public readonly string? Destination;
        /// <summary>
        /// The direction of the traffic to which the access control policy applies.
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Control Policy IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? IpVersion;
        public readonly string? Lang;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Cloud Firewall Control Policies. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetControlPoliciesPolicyResult> Policies;
        /// <summary>
        /// The type of the protocol in the access control policy.
        /// </summary>
        public readonly string? Proto;
        /// <summary>
        /// The source address in the access control policy.
        /// </summary>
        public readonly string? Source;

        [OutputConstructor]
        private GetControlPoliciesResult(
            string? aclAction,

            string? aclUuid,

            string? description,

            string? destination,

            string direction,

            string id,

            ImmutableArray<string> ids,

            string? ipVersion,

            string? lang,

            string? outputFile,

            ImmutableArray<Outputs.GetControlPoliciesPolicyResult> policies,

            string? proto,

            string? source)
        {
            AclAction = aclAction;
            AclUuid = aclUuid;
            Description = description;
            Destination = destination;
            Direction = direction;
            Id = id;
            Ids = ids;
            IpVersion = ipVersion;
            Lang = lang;
            OutputFile = outputFile;
            Policies = policies;
            Proto = proto;
            Source = source;
        }
    }
}
