# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetRouterInterfacesResult',
    'AwaitableGetRouterInterfacesResult',
    'get_router_interfaces',
    'get_router_interfaces_output',
]

@pulumi.output_type
class GetRouterInterfacesResult:
    """
    A collection of values returned by getRouterInterfaces.
    """
    def __init__(__self__, id=None, ids=None, interfaces=None, name_regex=None, names=None, opposite_interface_id=None, opposite_interface_owner_id=None, output_file=None, role=None, router_id=None, router_type=None, specification=None, status=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if interfaces and not isinstance(interfaces, list):
            raise TypeError("Expected argument 'interfaces' to be a list")
        pulumi.set(__self__, "interfaces", interfaces)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if opposite_interface_id and not isinstance(opposite_interface_id, str):
            raise TypeError("Expected argument 'opposite_interface_id' to be a str")
        pulumi.set(__self__, "opposite_interface_id", opposite_interface_id)
        if opposite_interface_owner_id and not isinstance(opposite_interface_owner_id, str):
            raise TypeError("Expected argument 'opposite_interface_owner_id' to be a str")
        pulumi.set(__self__, "opposite_interface_owner_id", opposite_interface_owner_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        pulumi.set(__self__, "role", role)
        if router_id and not isinstance(router_id, str):
            raise TypeError("Expected argument 'router_id' to be a str")
        pulumi.set(__self__, "router_id", router_id)
        if router_type and not isinstance(router_type, str):
            raise TypeError("Expected argument 'router_type' to be a str")
        pulumi.set(__self__, "router_type", router_type)
        if specification and not isinstance(specification, str):
            raise TypeError("Expected argument 'specification' to be a str")
        pulumi.set(__self__, "specification", specification)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

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
        """
        A list of router interface IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def interfaces(self) -> Sequence['outputs.GetRouterInterfacesInterfaceResult']:
        """
        A list of router interfaces. Each element contains the following attributes:
        """
        return pulumi.get(self, "interfaces")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of router interface names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="oppositeInterfaceId")
    def opposite_interface_id(self) -> Optional[str]:
        """
        Peer router interface ID.
        """
        return pulumi.get(self, "opposite_interface_id")

    @property
    @pulumi.getter(name="oppositeInterfaceOwnerId")
    def opposite_interface_owner_id(self) -> Optional[str]:
        """
        Account ID of the owner of the peer router interface.
        """
        return pulumi.get(self, "opposite_interface_owner_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def role(self) -> Optional[str]:
        """
        Router interface role. Possible values: `InitiatingSide` and `AcceptingSide`.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="routerId")
    def router_id(self) -> Optional[str]:
        """
        ID of the VRouter located in the local region.
        """
        return pulumi.get(self, "router_id")

    @property
    @pulumi.getter(name="routerType")
    def router_type(self) -> Optional[str]:
        """
        Router type in the local region. Possible values: `VRouter` and `VBR`.
        """
        return pulumi.get(self, "router_type")

    @property
    @pulumi.getter
    def specification(self) -> Optional[str]:
        """
        Router interface specification. Possible values: `Small.1`, `Middle.1`, `Large.2`, ...etc.
        """
        return pulumi.get(self, "specification")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        Router interface status. Possible values: `Active`, `Inactive` and `Idle`.
        """
        return pulumi.get(self, "status")


class AwaitableGetRouterInterfacesResult(GetRouterInterfacesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRouterInterfacesResult(
            id=self.id,
            ids=self.ids,
            interfaces=self.interfaces,
            name_regex=self.name_regex,
            names=self.names,
            opposite_interface_id=self.opposite_interface_id,
            opposite_interface_owner_id=self.opposite_interface_owner_id,
            output_file=self.output_file,
            role=self.role,
            router_id=self.router_id,
            router_type=self.router_type,
            specification=self.specification,
            status=self.status)


def get_router_interfaces(ids: Optional[Sequence[str]] = None,
                          name_regex: Optional[str] = None,
                          opposite_interface_id: Optional[str] = None,
                          opposite_interface_owner_id: Optional[str] = None,
                          output_file: Optional[str] = None,
                          role: Optional[str] = None,
                          router_id: Optional[str] = None,
                          router_type: Optional[str] = None,
                          specification: Optional[str] = None,
                          status: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRouterInterfacesResult:
    """
    This data source provides information about [router interfaces](https://www.alibabacloud.com/help/en/express-connect/developer-reference/api-vpc-2016-04-28-describerouterinterfaces-efficiency-channels)
    that connect VPCs together.

    > **DEPRECATED:**  This datasource has been deprecated from version `1.199.0`. Please use new data source alicloud_express_connect_router_interfaces.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    router_interfaces_ds = alicloud.vpc.get_router_interfaces(name_regex="^testenv",
        status="Active")
    pulumi.export("firstRouterInterfaceId", router_interfaces_ds.interfaces[0].id)
    ```


    :param Sequence[str] ids: A list of router interface IDs.
    :param str name_regex: A regex string used to filter by router interface name.
    :param str opposite_interface_id: ID of the peer router interface.
    :param str opposite_interface_owner_id: Account ID of the owner of the peer router interface.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str role: Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and 
           `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
    :param str router_id: ID of the VRouter located in the local region.
    :param str router_type: Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
    :param str specification: Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
    :param str status: Expected status. Valid values are `Active`, `Inactive` and `Idle`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['oppositeInterfaceId'] = opposite_interface_id
    __args__['oppositeInterfaceOwnerId'] = opposite_interface_owner_id
    __args__['outputFile'] = output_file
    __args__['role'] = role
    __args__['routerId'] = router_id
    __args__['routerType'] = router_type
    __args__['specification'] = specification
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getRouterInterfaces:getRouterInterfaces', __args__, opts=opts, typ=GetRouterInterfacesResult).value

    return AwaitableGetRouterInterfacesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        interfaces=pulumi.get(__ret__, 'interfaces'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        opposite_interface_id=pulumi.get(__ret__, 'opposite_interface_id'),
        opposite_interface_owner_id=pulumi.get(__ret__, 'opposite_interface_owner_id'),
        output_file=pulumi.get(__ret__, 'output_file'),
        role=pulumi.get(__ret__, 'role'),
        router_id=pulumi.get(__ret__, 'router_id'),
        router_type=pulumi.get(__ret__, 'router_type'),
        specification=pulumi.get(__ret__, 'specification'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_router_interfaces)
def get_router_interfaces_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                 opposite_interface_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 opposite_interface_owner_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                 role: Optional[pulumi.Input[Optional[str]]] = None,
                                 router_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 router_type: Optional[pulumi.Input[Optional[str]]] = None,
                                 specification: Optional[pulumi.Input[Optional[str]]] = None,
                                 status: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRouterInterfacesResult]:
    """
    This data source provides information about [router interfaces](https://www.alibabacloud.com/help/en/express-connect/developer-reference/api-vpc-2016-04-28-describerouterinterfaces-efficiency-channels)
    that connect VPCs together.

    > **DEPRECATED:**  This datasource has been deprecated from version `1.199.0`. Please use new data source alicloud_express_connect_router_interfaces.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    router_interfaces_ds = alicloud.vpc.get_router_interfaces(name_regex="^testenv",
        status="Active")
    pulumi.export("firstRouterInterfaceId", router_interfaces_ds.interfaces[0].id)
    ```


    :param Sequence[str] ids: A list of router interface IDs.
    :param str name_regex: A regex string used to filter by router interface name.
    :param str opposite_interface_id: ID of the peer router interface.
    :param str opposite_interface_owner_id: Account ID of the owner of the peer router interface.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str role: Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and 
           `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
    :param str router_id: ID of the VRouter located in the local region.
    :param str router_type: Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
    :param str specification: Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
    :param str status: Expected status. Valid values are `Active`, `Inactive` and `Idle`.
    """
    ...
