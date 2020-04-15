// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway.Outputs
{

    [OutputType]
    public sealed class ApiRequestParameter
    {
        /// <summary>
        /// The default value of the parameter.
        /// </summary>
        public readonly string? DefaultValue;
        /// <summary>
        /// The description of Constant parameter.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// System parameter location; values: 'HEAD' and 'QUERY'.
        /// </summary>
        public readonly string In;
        /// <summary>
        /// Backend service's parameter location; values: BODY, HEAD, QUERY, and PATH.
        /// </summary>
        public readonly string InService;
        /// <summary>
        /// System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html)
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Backend service's parameter name.
        /// </summary>
        public readonly string NameService;
        /// <summary>
        /// Parameter required or not; values: REQUIRED and OPTIONAL.
        /// </summary>
        public readonly string Required;
        /// <summary>
        /// Parameter type which supports values of 'STRING','INT','BOOLEAN','LONG',"FLOAT" and "DOUBLE"
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ApiRequestParameter(
            string? defaultValue,

            string? description,

            string @in,

            string inService,

            string name,

            string nameService,

            string required,

            string type)
        {
            DefaultValue = defaultValue;
            Description = description;
            In = @in;
            InService = inService;
            Name = name;
            NameService = nameService;
            Required = required;
            Type = type;
        }
    }
}
