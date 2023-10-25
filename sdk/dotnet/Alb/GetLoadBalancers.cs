// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    public static class GetLoadBalancers
    {
        /// <summary>
        /// This data source provides the Alb Load Balancers of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.132.0+.
        /// </summary>
        public static Task<GetLoadBalancersResult> InvokeAsync(GetLoadBalancersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancersResult>("alicloud:alb/getLoadBalancers:getLoadBalancers", args ?? new GetLoadBalancersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Alb Load Balancers of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.132.0+.
        /// </summary>
        public static Output<GetLoadBalancersResult> Invoke(GetLoadBalancersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancersResult>("alicloud:alb/getLoadBalancers:getLoadBalancers", args ?? new GetLoadBalancersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of IP address that the ALB instance uses to provide services.
        /// </summary>
        [Input("addressType")]
        public string? AddressType { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Load Balancer IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Load Balancing of the Service Status. Valid Values: `Abnormal` and `Normal`. **NOTE:** Available in 1.142.0+
        /// </summary>
        [Input("loadBalancerBusinessStatus")]
        public string? LoadBalancerBusinessStatus { get; set; }

        /// <summary>
        /// Load Balancing of the Service Status. Valid Values: `Abnormal` and `Normal`.  **NOTE:** Field 'load_balancer_bussiness_status' has been deprecated from provider version 1.142.0.
        /// </summary>
        [Input("loadBalancerBussinessStatus")]
        public string? LoadBalancerBussinessStatus { get; set; }

        [Input("loadBalancerIds")]
        private List<string>? _loadBalancerIds;

        /// <summary>
        /// The load balancer ids.
        /// </summary>
        public List<string> LoadBalancerIds
        {
            get => _loadBalancerIds ?? (_loadBalancerIds = new List<string>());
            set => _loadBalancerIds = value;
        }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("loadBalancerName")]
        public string? LoadBalancerName { get; set; }

        /// <summary>
        /// A regex string to filter results by Load Balancer name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The The load balancer status. Valid values: `Active`, `Configuring`, `CreateFailed`, `Inactive` and `Provisioning`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        [Input("vpcIds")]
        private List<string>? _vpcIds;

        /// <summary>
        /// The vpc ids.
        /// </summary>
        public List<string> VpcIds
        {
            get => _vpcIds ?? (_vpcIds = new List<string>());
            set => _vpcIds = value;
        }

        /// <summary>
        /// The ID of the zone to which the ALB instance belongs.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetLoadBalancersArgs()
        {
        }
        public static new GetLoadBalancersArgs Empty => new GetLoadBalancersArgs();
    }

    public sealed class GetLoadBalancersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of IP address that the ALB instance uses to provide services.
        /// </summary>
        [Input("addressType")]
        public Input<string>? AddressType { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Load Balancer IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Load Balancing of the Service Status. Valid Values: `Abnormal` and `Normal`. **NOTE:** Available in 1.142.0+
        /// </summary>
        [Input("loadBalancerBusinessStatus")]
        public Input<string>? LoadBalancerBusinessStatus { get; set; }

        /// <summary>
        /// Load Balancing of the Service Status. Valid Values: `Abnormal` and `Normal`.  **NOTE:** Field 'load_balancer_bussiness_status' has been deprecated from provider version 1.142.0.
        /// </summary>
        [Input("loadBalancerBussinessStatus")]
        public Input<string>? LoadBalancerBussinessStatus { get; set; }

        [Input("loadBalancerIds")]
        private InputList<string>? _loadBalancerIds;

        /// <summary>
        /// The load balancer ids.
        /// </summary>
        public InputList<string> LoadBalancerIds
        {
            get => _loadBalancerIds ?? (_loadBalancerIds = new InputList<string>());
            set => _loadBalancerIds = value;
        }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("loadBalancerName")]
        public Input<string>? LoadBalancerName { get; set; }

        /// <summary>
        /// A regex string to filter results by Load Balancer name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The The load balancer status. Valid values: `Active`, `Configuring`, `CreateFailed`, `Inactive` and `Provisioning`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        [Input("vpcIds")]
        private InputList<string>? _vpcIds;

        /// <summary>
        /// The vpc ids.
        /// </summary>
        public InputList<string> VpcIds
        {
            get => _vpcIds ?? (_vpcIds = new InputList<string>());
            set => _vpcIds = value;
        }

        /// <summary>
        /// The ID of the zone to which the ALB instance belongs.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetLoadBalancersInvokeArgs()
        {
        }
        public static new GetLoadBalancersInvokeArgs Empty => new GetLoadBalancersInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadBalancersResult
    {
        public readonly string? AddressType;
        public readonly ImmutableArray<Outputs.GetLoadBalancersBalancerResult> Balancers;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? LoadBalancerBusinessStatus;
        public readonly string? LoadBalancerBussinessStatus;
        public readonly ImmutableArray<string> LoadBalancerIds;
        public readonly string? LoadBalancerName;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ResourceGroupId;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly string? VpcId;
        public readonly ImmutableArray<string> VpcIds;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetLoadBalancersResult(
            string? addressType,

            ImmutableArray<Outputs.GetLoadBalancersBalancerResult> balancers,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? loadBalancerBusinessStatus,

            string? loadBalancerBussinessStatus,

            ImmutableArray<string> loadBalancerIds,

            string? loadBalancerName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId,

            string? status,

            ImmutableDictionary<string, object>? tags,

            string? vpcId,

            ImmutableArray<string> vpcIds,

            string? zoneId)
        {
            AddressType = addressType;
            Balancers = balancers;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            LoadBalancerBusinessStatus = loadBalancerBusinessStatus;
            LoadBalancerBussinessStatus = loadBalancerBussinessStatus;
            LoadBalancerIds = loadBalancerIds;
            LoadBalancerName = loadBalancerName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Tags = tags;
            VpcId = vpcId;
            VpcIds = vpcIds;
            ZoneId = zoneId;
        }
    }
}
