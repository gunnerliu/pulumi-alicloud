# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetModelsResult',
    'AwaitableGetModelsResult',
    'get_models',
    'get_models_output',
]

@pulumi.output_type
class GetModelsResult:
    """
    A collection of values returned by getModels.
    """
    def __init__(__self__, group_id=None, id=None, ids=None, model_name=None, models=None, name_regex=None, names=None, output_file=None, page_number=None, page_size=None):
        if group_id and not isinstance(group_id, str):
            raise TypeError("Expected argument 'group_id' to be a str")
        pulumi.set(__self__, "group_id", group_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if model_name and not isinstance(model_name, str):
            raise TypeError("Expected argument 'model_name' to be a str")
        pulumi.set(__self__, "model_name", model_name)
        if models and not isinstance(models, list):
            raise TypeError("Expected argument 'models' to be a list")
        pulumi.set(__self__, "models", models)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        The group of the model belongs to.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="modelName")
    def model_name(self) -> Optional[str]:
        """
        The name of the Model.
        """
        return pulumi.get(self, "model_name")

    @property
    @pulumi.getter
    def models(self) -> Sequence['outputs.GetModelsModelResult']:
        """
        A list of Api Gateway Models. Each element contains the following attributes:
        """
        return pulumi.get(self, "models")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of Model names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")


class AwaitableGetModelsResult(GetModelsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetModelsResult(
            group_id=self.group_id,
            id=self.id,
            ids=self.ids,
            model_name=self.model_name,
            models=self.models,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size)


def get_models(group_id: Optional[str] = None,
               ids: Optional[Sequence[str]] = None,
               model_name: Optional[str] = None,
               name_regex: Optional[str] = None,
               output_file: Optional[str] = None,
               page_number: Optional[int] = None,
               page_size: Optional[int] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetModelsResult:
    """
    This data source provides the Api Gateway Models of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.187.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.apigateway.get_models(ids=["example_id"],
        group_id="example_group_id")
    pulumi.export("apiGatewayModelId1", ids.models[0].id)
    group_id = alicloud.apigateway.get_models(group_id="example_group_id")
    pulumi.export("apiGatewayModelId2", group_id.models[0].id)
    ```


    :param str group_id: The ID of the api group.
    :param Sequence[str] ids: A list of Model IDs.
    :param str model_name: The name of the Model.
    :param str name_regex: A regex string to filter results by Model name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['groupId'] = group_id
    __args__['ids'] = ids
    __args__['modelName'] = model_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:apigateway/getModels:getModels', __args__, opts=opts, typ=GetModelsResult).value

    return AwaitableGetModelsResult(
        group_id=pulumi.get(__ret__, 'group_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        model_name=pulumi.get(__ret__, 'model_name'),
        models=pulumi.get(__ret__, 'models'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'))


@_utilities.lift_output_func(get_models)
def get_models_output(group_id: Optional[pulumi.Input[str]] = None,
                      ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                      model_name: Optional[pulumi.Input[Optional[str]]] = None,
                      name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                      output_file: Optional[pulumi.Input[Optional[str]]] = None,
                      page_number: Optional[pulumi.Input[Optional[int]]] = None,
                      page_size: Optional[pulumi.Input[Optional[int]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetModelsResult]:
    """
    This data source provides the Api Gateway Models of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.187.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.apigateway.get_models(ids=["example_id"],
        group_id="example_group_id")
    pulumi.export("apiGatewayModelId1", ids.models[0].id)
    group_id = alicloud.apigateway.get_models(group_id="example_group_id")
    pulumi.export("apiGatewayModelId2", group_id.models[0].id)
    ```


    :param str group_id: The ID of the api group.
    :param Sequence[str] ids: A list of Model IDs.
    :param str model_name: The name of the Model.
    :param str name_regex: A regex string to filter results by Model name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
