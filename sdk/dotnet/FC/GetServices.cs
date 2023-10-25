// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC
{
    public static class GetServices
    {
        /// <summary>
        /// This data source provides the Function Compute services of the current Alibaba Cloud user.
        /// </summary>
        public static Task<GetServicesResult> InvokeAsync(GetServicesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServicesResult>("alicloud:fc/getServices:getServices", args ?? new GetServicesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Function Compute services of the current Alibaba Cloud user.
        /// </summary>
        public static Output<GetServicesResult> Invoke(GetServicesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServicesResult>("alicloud:fc/getServices:getServices", args ?? new GetServicesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServicesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of FC services ids.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by FC service name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetServicesArgs()
        {
        }
        public static new GetServicesArgs Empty => new GetServicesArgs();
    }

    public sealed class GetServicesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of FC services ids.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by FC service name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetServicesInvokeArgs()
        {
        }
        public static new GetServicesInvokeArgs Empty => new GetServicesInvokeArgs();
    }


    [OutputType]
    public sealed class GetServicesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of FC services ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of FC services names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of FC services. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServicesServiceResult> Services;

        [OutputConstructor]
        private GetServicesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetServicesServiceResult> services)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Services = services;
        }
    }
}
